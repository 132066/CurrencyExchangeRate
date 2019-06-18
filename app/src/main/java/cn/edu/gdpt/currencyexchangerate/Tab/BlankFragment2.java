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
    String url = "http://web.juhe.cn:8080/finance/exchange/rmbquot?key=e73535d39e96d223e20af0f89764af06";
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

            TextView name = view.findViewById(R.id.tv_name);
            TextView buy_Rate = view.findViewById(R.id.tv_Buy_Rate);
            TextView cash_Buy = view.findViewById(R.id.tv_Cash_Buy);
            TextView cash_Selling_Price = view.findViewById(R.id.tv_Cash_Selling_Price);
            TextView bank_Conversion = view.findViewById(R.id.tv_Bank_Conversion);
            TextView date_Of_Publication = view.findViewById(R.id.tv_Date_Of_Publication);
            TextView spot_Selling_Price = view.findViewById(R.id.tv_Spot_Selling_Price);

            TextView name2 = view.findViewById(R.id.tv_name2);
            TextView buy_Rate2 = view.findViewById(R.id.tv_Buy_Rate2);
            TextView cash_Buy2 = view.findViewById(R.id.tv_Cash_Buy2);
            TextView cash_Selling_Price2 = view.findViewById(R.id.tv_Cash_Selling_Price2);
            TextView bank_Conversion2 = view.findViewById(R.id.tv_Bank_Conversion2);
            TextView date_Of_Publication2 = view.findViewById(R.id.tv_Date_Of_Publication2);
            TextView spot_Selling_Price2 = view.findViewById(R.id.tv_Spot_Selling_Price2);

            TextView name3 = view.findViewById(R.id.tv_name3);
            TextView buy_Rate3 = view.findViewById(R.id.tv_Buy_Rate3);
            TextView cash_Buy3 = view.findViewById(R.id.tv_Cash_Buy3);
            TextView cash_Selling_Price3 = view.findViewById(R.id.tv_Cash_Selling_Price3);
            TextView bank_Conversion3 = view.findViewById(R.id.tv_Bank_Conversion3);
            TextView date_Of_Publication3 = view.findViewById(R.id.tv_Date_Of_Publication3);
            TextView spot_Selling_Price3 = view.findViewById(R.id.tv_Spot_Selling_Price3);

            TextView name4 = view.findViewById(R.id.tv_name4);
            TextView buy_Rate4 = view.findViewById(R.id.tv_Buy_Rate4);
            TextView cash_Buy4 = view.findViewById(R.id.tv_Cash_Buy4);
            TextView cash_Selling_Price4 = view.findViewById(R.id.tv_Cash_Selling_Price4);
            TextView bank_Conversion4= view.findViewById(R.id.tv_Bank_Conversion4);
            TextView date_Of_Publication4 = view.findViewById(R.id.tv_Date_Of_Publication4);
            TextView spot_Selling_Price4 = view.findViewById(R.id.tv_Spot_Selling_Price4);

            TextView name5 = view.findViewById(R.id.tv_name5);
            TextView buy_Rate5 = view.findViewById(R.id.tv_Buy_Rate5);
            TextView cash_Buy5 = view.findViewById(R.id.tv_Cash_Buy5);
            TextView cash_Selling_Price5 = view.findViewById(R.id.tv_Cash_Selling_Price5);
            TextView bank_Conversion5 = view.findViewById(R.id.tv_Bank_Conversion5);
            TextView date_Of_Publication5 = view.findViewById(R.id.tv_Date_Of_Publication5);
            TextView spot_Selling_Price5 = view.findViewById(R.id.tv_Spot_Selling_Price5);

            TextView name6 = view.findViewById(R.id.tv_name6);
            TextView buy_Rate6 = view.findViewById(R.id.tv_Buy_Rate6);
            TextView cash_Buy6 = view.findViewById(R.id.tv_Cash_Buy6);
            TextView cash_Selling_Price6 = view.findViewById(R.id.tv_Cash_Selling_Price6);
            TextView bank_Conversion6 = view.findViewById(R.id.tv_Bank_Conversion6);
            TextView date_Of_Publication6 = view.findViewById(R.id.tv_Date_Of_Publication6);
            TextView spot_Selling_Price6 = view.findViewById(R.id.tv_Spot_Selling_Price6);

            TextView name7 = view.findViewById(R.id.tv_name7);
            TextView buy_Rate7 = view.findViewById(R.id.tv_Buy_Rate7);
            TextView cash_Buy7 = view.findViewById(R.id.tv_Cash_Buy7);
            TextView cash_Selling_Price7 = view.findViewById(R.id.tv_Cash_Selling_Price7);
            TextView bank_Conversion7 = view.findViewById(R.id.tv_Bank_Conversion7);
            TextView date_Of_Publication7 = view.findViewById(R.id.tv_Date_Of_Publication7);
            TextView spot_Selling_Price7 = view.findViewById(R.id.tv_Spot_Selling_Price7);

            TextView name8 = view.findViewById(R.id.tv_name8);
            TextView buy_Rate8 = view.findViewById(R.id.tv_Buy_Rate8);
            TextView cash_Buy8 = view.findViewById(R.id.tv_Cash_Buy8);
            TextView cash_Selling_Price8 = view.findViewById(R.id.tv_Cash_Selling_Price8);
            TextView bank_Conversion8 = view.findViewById(R.id.tv_Bank_Conversion8);
            TextView date_Of_Publication8 = view.findViewById(R.id.tv_Date_Of_Publication8);
            TextView spot_Selling_Price8 = view.findViewById(R.id.tv_Spot_Selling_Price8);

            TextView name9 = view.findViewById(R.id.tv_name9);
            TextView buy_Rate9 = view.findViewById(R.id.tv_Buy_Rate9);
            TextView cash_Buy9 = view.findViewById(R.id.tv_Cash_Buy9);
            TextView cash_Selling_Price9 = view.findViewById(R.id.tv_Cash_Selling_Price9);
            TextView bank_Conversion9 = view.findViewById(R.id.tv_Bank_Conversion9);
            TextView date_Of_Publication9 = view.findViewById(R.id.tv_Date_Of_Publication9);
            TextView spot_Selling_Price9 = view.findViewById(R.id.tv_Spot_Selling_Price9);

            if (list.size() > 0) {
                RateBean.ResultBean.Data1Bean data1 = list.get(position).getResult().get(position).getData1();
                RateBean.ResultBean.Data2Bean data2 = list.get(position).getResult().get(position).getData2();
                RateBean.ResultBean.Data3Bean data3 = list.get(position).getResult().get(position).getData3();
                RateBean.ResultBean.Data4Bean data4 = list.get(position).getResult().get(position).getData4();
                RateBean.ResultBean.Data5Bean data5 = list.get(position).getResult().get(position).getData5();
                RateBean.ResultBean.Data6Bean data6 = list.get(position).getResult().get(position).getData6();
                RateBean.ResultBean.Data7Bean data7 = list.get(position).getResult().get(position).getData7();
                RateBean.ResultBean.Data8Bean data8 = list.get(position).getResult().get(position).getData8();
                RateBean.ResultBean.Data9Bean data9 = list.get(position).getResult().get(position).getData9();

                name.setText(data1.getName());
                buy_Rate.setText(data1.getFBuyPri());
                cash_Buy.setText(data1.getMBuyPri());
                spot_Selling_Price.setText(data1.getFSellPri());
                cash_Selling_Price.setText(data1.getMSellPri());
                bank_Conversion.setText(data1.getBankConversionPri());
                date_Of_Publication.setText(data1.getDate());

                name2.setText(data2.getName());
                buy_Rate2.setText(data2.getFBuyPri());
                cash_Buy2.setText(data2.getMBuyPri());
                spot_Selling_Price2.setText(data2.getFSellPri());
                cash_Selling_Price2.setText(data2.getMSellPri());
                bank_Conversion2.setText(data2.getBankConversionPri());
                date_Of_Publication2.setText(data2.getDate());

                name3.setText(data3.getName());
                buy_Rate3.setText(data3.getFBuyPri());
                cash_Buy3.setText(data3.getMBuyPri());
                spot_Selling_Price3.setText(data3.getFSellPri());
                cash_Selling_Price3.setText(data3.getMSellPri());
                bank_Conversion3.setText(data3.getBankConversionPri());
                date_Of_Publication3.setText(data3.getDate());

                name4.setText(data4.getName());
                buy_Rate4.setText(data4.getFBuyPri());
                cash_Buy4.setText(data4.getMBuyPri());
                spot_Selling_Price4.setText(data4.getFSellPri());
                cash_Selling_Price4.setText(data4.getMSellPri());
                bank_Conversion4.setText(data4.getBankConversionPri());
                date_Of_Publication4.setText(data4.getDate());

                name5.setText(data5.getName());
                buy_Rate5.setText(data5.getFBuyPri());
                cash_Buy5.setText(data5.getMBuyPri());
                spot_Selling_Price5.setText(data5.getFSellPri());
                cash_Selling_Price5.setText(data5.getMSellPri());
                bank_Conversion5.setText(data5.getBankConversionPri());
                date_Of_Publication5.setText(data5.getDate());

                name6.setText(data6.getName());
                buy_Rate6.setText(data6.getFBuyPri());
                cash_Buy6.setText(data6.getMBuyPri());
                spot_Selling_Price6.setText(data6.getFSellPri());
                cash_Selling_Price6.setText(data6.getMSellPri());
                bank_Conversion6.setText(data6.getBankConversionPri());
                date_Of_Publication6.setText(data6.getDate());

                name7.setText(data7.getName());
                buy_Rate7.setText(data7.getFBuyPri());
                cash_Buy7.setText(data7.getMBuyPri());
                spot_Selling_Price7.setText(data7.getFSellPri());
                cash_Selling_Price7.setText(data7.getMSellPri());
                bank_Conversion7.setText(data7.getBankConversionPri());
                date_Of_Publication7.setText(data7.getDate());

                name8.setText(data8.getName());
                buy_Rate8.setText(data8.getFBuyPri());
                cash_Buy8.setText(data8.getMBuyPri());
                spot_Selling_Price8.setText(data8.getFSellPri());
                cash_Selling_Price8.setText(data8.getMSellPri());
                bank_Conversion8.setText(data8.getBankConversionPri());
                date_Of_Publication8.setText(data8.getDate());

                name9.setText(data9.getName());
                buy_Rate9.setText(data9.getFBuyPri());
                cash_Buy9.setText(data9.getMBuyPri());
                spot_Selling_Price9.setText(data9.getFSellPri());
                cash_Selling_Price9.setText(data9.getMSellPri());
                bank_Conversion9.setText(data9.getBankConversionPri());
                date_Of_Publication9.setText(data9.getDate());
            }else {
                name.setText("2123");
            }

            return view;
        }
    }

}
