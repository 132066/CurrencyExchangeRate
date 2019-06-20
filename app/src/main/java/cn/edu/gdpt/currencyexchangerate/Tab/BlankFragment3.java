package cn.edu.gdpt.currencyexchangerate.Tab;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.edu.gdpt.currencyexchangerate.LoginActivity;
import cn.edu.gdpt.currencyexchangerate.R;
import de.hdodenhof.circleimageview.CircleImageView;


public class BlankFragment3 extends Fragment implements View.OnClickListener {
    private View view;
    private boolean isLogin = false;
    private CollapsingToolbarLayout collapsing_tool_bar;
    private CircleImageView iv_avatar;

    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank_fragment3, container, false);
        initView(view);
        return view;
    }


    private void initView(View view) {
        collapsing_tool_bar = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_tool_bar);
        iv_avatar = (CircleImageView) view.findViewById(R.id.iv_avatar);
        collapsing_tool_bar.setTitle("未登录");
        iv_avatar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_avatar:
                Intent intent = new Intent(getActivity().getApplicationContext(), LoginActivity.class);
                startActivityForResult(intent, 1);
                break;

        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && data != null) {
            boolean isLogin = data.getBooleanExtra("isLogin", false);
            String userName = data.getStringExtra("LoginUserName");
            collapsing_tool_bar.setTitle(userName);
            this.isLogin = isLogin;
        }
    }
}