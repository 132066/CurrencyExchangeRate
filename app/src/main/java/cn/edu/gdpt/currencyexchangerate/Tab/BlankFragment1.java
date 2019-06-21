package cn.edu.gdpt.currencyexchangerate.Tab;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdpt.currencyexchangerate.HttpRequest_Utils;
import cn.edu.gdpt.currencyexchangerate.R;
import cn.edu.gdpt.currencyexchangerate.Rate.FinanceExchange;

public class BlankFragment1 extends Fragment {
    final int SUCCESS = 1;
    Handler handler;
    List<FinanceExchange> list;
    private Activity activity;


    String url = "http://web.juhe.cn:8080/finance/exchange/frate?key=e73535d39e96d223e20af0f89764af06";

    @SuppressLint("HandlerLeak")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        activity = getActivity();
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_blank_fragment1, container, false);
        final TextView name1 = view.findViewById(R.id.tv_name1);
        final TextView core1 = view.findViewById(R.id.tv_core1);
        final EditText rate1 = view.findViewById(R.id.et_rate1);
        final TextView company1 = view.findViewById(R.id.company1);

        final TextView name2 = view.findViewById(R.id.tv_name2);
        final TextView core2 = view.findViewById(R.id.tv_core2);
        final EditText rate2 = view.findViewById(R.id.et_rate2);
        final TextView company2 = view.findViewById(R.id.company2);

        final TextView name3 = view.findViewById(R.id.tv_name3);
        final TextView core3 = view.findViewById(R.id.tv_core3);
        final EditText rate3 = view.findViewById(R.id.et_rate3);
        final TextView company3 = view.findViewById(R.id.company3);

        final TextView name4 = view.findViewById(R.id.tv_name4);
        final TextView core4 = view.findViewById(R.id.tv_core4);
        final EditText rate4 = view.findViewById(R.id.et_rate4);
        final TextView company4 = view.findViewById(R.id.company4);

        final TextView name5 = view.findViewById(R.id.tv_name5);
        final TextView core5 = view.findViewById(R.id.tv_coree5);
        final EditText rate5 = view.findViewById(R.id.et_rate5);
        final TextView company5 = view.findViewById(R.id.company5);

        final TextView name6 = view.findViewById(R.id.tv_name6);
        final TextView core6 = view.findViewById(R.id.tv_coree6);
        final EditText rate6 = view.findViewById(R.id.et_rate6);
        final TextView company6 = view.findViewById(R.id.company6);

        final TextView name7 = view.findViewById(R.id.tv_name7);
        final TextView core7 = view.findViewById(R.id.tv_coree7);
        final EditText rate7 = view.findViewById(R.id.et_rate7);
        final TextView company7 = view.findViewById(R.id.company7);

        final TextView name8 = view.findViewById(R.id.tv_name8);
        final TextView core8 = view.findViewById(R.id.tv_coree8);
        final EditText rate8 = view.findViewById(R.id.et_rate8);
        final TextView company8 = view.findViewById(R.id.company8);

        final TextView name9 = view.findViewById(R.id.tv_name9);
        final TextView core9 = view.findViewById(R.id.tv_coree9);
        final EditText rate9 = view.findViewById(R.id.et_rate9);
        final TextView company9 = view.findViewById(R.id.company9);

        final TextView name10 = view.findViewById(R.id.tv_name10);
        final TextView core10 = view.findViewById(R.id.tv_coree10);
        final EditText rate10 = view.findViewById(R.id.et_rate10);
        final TextView company10 = view.findViewById(R.id.company10);

        final TextView name11 = view.findViewById(R.id.tv_name11);
        final TextView core11 = view.findViewById(R.id.tv_coree11);
        final EditText rate11 = view.findViewById(R.id.et_rate11);
        final TextView company11 = view.findViewById(R.id.company11);

        final TextView name12 = view.findViewById(R.id.tv_name12);
        final TextView core12 = view.findViewById(R.id.tv_coree12);
        final EditText rate12 = view.findViewById(R.id.et_rate12);
        final TextView company12 = view.findViewById(R.id.company12);

        final Button button = view.findViewById(R.id.btn_reserch);

        final EditText[] editTexts = {rate1, rate2, rate3, rate4, rate5};
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

        list = new ArrayList<FinanceExchange>();

        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what) {
                    case SUCCESS:
                        String json = (String) msg.obj;
                        FinanceExchange financeExchange = new Gson().fromJson(json, FinanceExchange.class);
                        list.add(financeExchange);
                        final FinanceExchange.ResultBean resultBean = financeExchange.getResult().get(0);



                        String currency = resultBean.getData1().getCurrency();
                        String currency2 = resultBean.getData2().getCurrency();
                        String currency3 = resultBean.getData3().getCurrency();
                        String currency4 = resultBean.getData4().getCurrency();
                        String currency5 = resultBean.getData5().getCurrency();
                        String currency6 = resultBean.getData6().getCurrency();
                        String currency7 = resultBean.getData7().getCurrency();
                        String currency8 = resultBean.getData8().getCurrency();
                        String currency9 = resultBean.getData9().getCurrency();
                        String currency10 = resultBean.getData10().getCurrency();
                        String currency11 = resultBean.getData11().getCurrency();
                        String currency12 = resultBean.getData12().getCurrency();




                        final String code = resultBean.getData1().getCode();
                        String code2 = resultBean.getData2().getCode();
                        final String code3 = resultBean.getData3().getCode();
                        final String code4 = resultBean.getData4().getCode();
                        final String code5 = resultBean.getData5().getCode();
                        final String code6 = resultBean.getData6().getCode();
                        final String code7 = resultBean.getData7().getCode();
                        final String code8 = resultBean.getData8().getCode();
                        final String code9 = resultBean.getData9().getCode();
                        final String code10 = resultBean.getData10().getCode();
                        final String code11 = resultBean.getData11().getCode();
                        final String code12 = resultBean.getData12().getCode();


                        String[] split = currency2.split("指数");
                        String[] split2 = currency.split("美元");
                        String[] split3 = currency3.split("美元");
                        String[] split4 = currency4.split("美元");
                        String[] split5 = currency5.split("美元");
                        String[] split6 = currency6.split("美元");
                        String[] split7 = currency7.split("美元");
                        String[] split8 = currency8.split("美元");
                        String[] split9 = currency9.split("美元");
                        String[] split10 = currency10.split("美元");
                        String[] split11 = currency11.split("美元");
                        String[] split12 = currency12.split("美元");


                        //int[] totalSum = new int[]{sum, sum2, sum3, sum4, sum5};

                        //rate2.setText(num*price);
                        /*for (int i = 0; i < editTexts.length; i++) {
                            editTexts[i].setText(totalSum[i]+"");
                        }*/

                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String price = resultBean.getData1().getClosePri();
                                String price2 = resultBean.getData2().getClosePri();
                                String price3 = resultBean.getData3().getClosePri();
                                String price4 = resultBean.getData4().getClosePri();
                                String price5 = resultBean.getData5().getClosePri();
                                String price6 = resultBean.getData6().getClosePri();
                                String price7 = resultBean.getData7().getClosePri();
                                String price8 = resultBean.getData8().getClosePri();
                                String price9 = resultBean.getData9().getClosePri();
                                String price10 = resultBean.getData10().getClosePri();
                                String price11 = resultBean.getData11().getClosePri();
                                String price12 = resultBean.getData12().getClosePri();


                                float rate = Float.parseFloat(rate1.getText().toString().trim());
                                float sum2 = Float.parseFloat(price)*rate;
                                float sum3 = Float.parseFloat(price3)*rate;
                                float sum4 = Float.parseFloat(price4)*rate;
                                float sum5 = Float.parseFloat(price5)*rate;
                                float sum6 = Float.parseFloat(price6)*rate;
                                float sum7 = Float.parseFloat(price7)*rate;
                                float sum8 = Float.parseFloat(price8)*rate;
                                float sum9 = Float.parseFloat(price9)*rate;
                                float sum10 = Float.parseFloat(price10)*rate;
                                float sum11 = Float.parseFloat(price11)*rate;
                                float sum12 = Float.parseFloat(price12)*rate;


                                rate2.setText(String.valueOf(sum2));
                                rate3.setText(String.valueOf(sum3));
                                rate4.setText(String.valueOf(sum4));
                                rate5.setText(String.valueOf(sum5));
                                rate6.setText(String.valueOf(sum6));
                                rate7.setText(String.valueOf(sum7));
                                rate8.setText(String.valueOf(sum8));
                                rate9.setText(String.valueOf(sum9));
                                rate10.setText(String.valueOf(sum10));
                                rate11.setText(String.valueOf(sum11));
                                rate12.setText(String.valueOf(sum12));
                            }
                        });



                        name1.setText(split[0]);
                        name2.setText(split2[0]);
                        name3.setText(split3[0]);
                        name4.setText(split4[0]);
                        name5.setText(split5[0]);
                        name6.setText(split6[1]);
                        name7.setText(split7[1]);
                        name8.setText(split8[1]);
                        name9.setText(split9[1]);
                        name10.setText(split10[1]);
                        name11.setText(split11[1]);
                        name12.setText(split12[1]);

                        company1.setText(split[0]);
                        company2.setText(split2[0]);
                        company3.setText(split3[0]);
                        company4.setText(split4[0]);
                        company5.setText(split5[0]);
                        company6.setText(split6[1]);
                        company7.setText(split7[1]);
                        company8.setText(split8[1]);
                        company9.setText(split9[1]);
                        company10.setText(split10[1]);
                        company11.setText(split11[1]);
                        company12.setText(split12[1]);

                        core1.setText(code2);
                        core2.setText(code);
                        core3.setText(code3);
                        core4.setText(code4);
                        core5.setText(code5);
                        core6.setText(code6);
                        core7.setText(code7);
                        core8.setText(code8);
                        core9.setText(code9);
                        core10.setText(code10);
                        core11.setText(code11);
                        core12.setText(code12);


                }
            }
        };


        return view;
    }


}
