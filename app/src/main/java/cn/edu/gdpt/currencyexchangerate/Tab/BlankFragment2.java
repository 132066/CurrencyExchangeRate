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
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdpt.currencyexchangerate.HttpRequest_Utils;
import cn.edu.gdpt.currencyexchangerate.R;
import cn.edu.gdpt.currencyexchangerate.Rate.RateBean;

public class BlankFragment2 extends Fragment {
    final int SUCCESS = 1;
    Handler handler;
    List<RateBean> list;
    GridView gridView;
    private Activity activity;
    private Adapter adapter;

    @SuppressLint("HandlerLeak")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        activity = getActivity();
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        gridView = view.findViewById(R.id.grid_view);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Message message = new Message();
                String sync_get = null;
                try {
                    sync_get = HttpRequest_Utils.Sync_Get("3");
                    message.what = SUCCESS;
                    message.obj = sync_get;
                    Thread.sleep(1000 * 3600);
                    handler.sendMessage(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();

        adapter = new Adapter();
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
                        adapter.notifyDataSetChanged();
                }
            }
        };

        gridView.setAdapter(adapter);

        return view;
    }

    private class Adapter extends BaseAdapter {

        @Override
        public int getCount() {
            return list == null ? 0 : list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view;
            if (convertView == null) {
                view = View.inflate(activity, R.layout.list_item, null);
            } else {
                view = convertView;
            }

            TextView textView = view.findViewById(R.id.tv);
            if (list.size() > 0) {
                RateBean.ResultBean.Data1Bean data1 = list.get(position).getResult().get(position).getData1();
                textView.setText(data1.getName());
            }else {
                textView.setText("ASdasd");
            }

            return view;
        }
    }

}
