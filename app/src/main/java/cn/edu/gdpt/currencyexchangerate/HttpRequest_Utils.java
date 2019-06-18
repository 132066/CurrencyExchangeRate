package cn.edu.gdpt.currencyexchangerate;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class HttpRequest_Utils {

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final String SUCCESS = "Success";
    private static final String FAILURE = "Failure";
    private static final String URL_1 = "http://web.juhe.cn:8080/finance/exchange/rmbquot?";
    private static final String URL_2 = "http://web.juhe.cn:8080/finance/exchange/frate?";
    private static final String API_Key = "e73535d39e96d223e20af0f89764af06";

    private static String Json;

    private static RequestBody requestBody;
    private static Response response;

    public static String Sync_Get(String url) throws IOException {
        String ss = "http://web.juhe.cn:8080/finance/exchange/rmbquot?key=e73535d39e96d223e20af0f89764af06";
        Request request = new Request.Builder().url(url).build();
        Response execute = okHttpClient.newCall(request).execute();
        if (execute.isSuccessful()) {
            Json = execute.body().string();
        }
        return Json;
    }


    public static String Async_Get(String Bank) {
        Request request = new Request.Builder().url(URL_2 + "key=" + API_Key + "&bank=" + Bank).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Json = "服务器错误";
            }

            @Override
            public void onResponse(Response response) throws IOException {
                Json = response.body().string();
            }
        });
        return Json;
    }

//    public static String Sync_Post(String Bank) throws IOException {
//        requestBody = new FormEncodingBuilder().add("key", API_Key).add("bank", Bank).build();
//
//        response = okHttpClient.newCall(new Request.Builder().url(URL_1).post(requestBody).build()).execute();
//        if (!response.isSuccessful()) {
//            Json = FAILURE;
//        } else {
//            Json = response.body().string();
//        }
//
//        return Json;
//    }
//
//    public static String ASync_Post(String Bank) {
//        requestBody = new FormEncodingBuilder().add("key", API_Key).add("bank", Bank).build();
//
//        okHttpClient.newCall(new Request.Builder().url(URL_1).post(requestBody).build()).enqueue(new Callback() {
//            @Override
//            public void onFailure(Request request, IOException e) {
//                Json = FAILURE;
//            }
//
//            @Override
//            public void onResponse(Response response) throws IOException {
//                Json = response.body().string();
//            }
//        });
//
//        return Json;
//    }
}
