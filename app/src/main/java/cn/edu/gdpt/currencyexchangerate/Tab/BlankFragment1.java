package cn.edu.gdpt.currencyexchangerate.Tab;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdpt.currencyexchangerate.HttpRequest_Utils;
import cn.edu.gdpt.currencyexchangerate.R;
import cn.edu.gdpt.currencyexchangerate.Rate.RateBean;

public class BlankFragment1 extends Fragment {
    final int SUCCESS = 1;
    Handler handler;
    List<RateBean> list;
    private Activity activity;
    ListView listView;

    String url = "http://web.juhe.cn:8080/finance/exchange/frate?key=e73535d39e96d223e20af0f89764af06";
    @SuppressLint("HandlerLeak")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        activity = getActivity();
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_blank_fragment1, container, false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                Message message = new Message();
                String sync_get = null;
                try {
                    sync_get = HttpRequest_Utils.Sync_Get(url);
                    message.what = SUCCESS;
                    message.obj = sync_get;
                    handler.sendMessage(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000 * 3600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        list = new ArrayList<>();
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what) {
                    case SUCCESS:
                        String json = (String) msg.obj;
                        RateBean rateBean = new Gson().fromJson(json, RateBean.class);
                        list.add(rateBean);
                }
            }
        };

        return view;
    }



}
