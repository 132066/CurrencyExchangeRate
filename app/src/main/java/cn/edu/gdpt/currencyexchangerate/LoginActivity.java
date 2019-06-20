package cn.edu.gdpt.currencyexchangerate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import cn.edu.gdpt.currencyexchangerate.ee.DBUtils;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img_login_title;
    private EditText edt_login_name;
    private EditText edt_login_password;
    private Button btn_login_login;
    private Button btn_login_register;
    private String userName, psw, spPsw;
    private DBUtils dbUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dbUtils=new DBUtils(this);
        initView();
    }

    private void initView() {
        img_login_title = (ImageView) findViewById(R.id.img_login_title);
        edt_login_name = (EditText) findViewById(R.id.edt_login_name);
        edt_login_password = (EditText) findViewById(R.id.edt_login_password);
        btn_login_login = (Button) findViewById(R.id.btn_login_login);
        btn_login_register = (Button) findViewById(R.id.btn_login_register);

        btn_login_login.setOnClickListener(this);
        btn_login_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login_login:
                userName = edt_login_name.getText().toString().trim();
                psw = edt_login_password.getText().toString().trim();
                if (TextUtils.isEmpty(userName)) {
                    Toast.makeText(LoginActivity.this, "请输入用户名", Toast.LENGTH_SHORT).show();
                    return;
                } else if (TextUtils.isEmpty(psw)) {
                    Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;
                } else if (dbUtils.userLogin(userName, psw)) {
                    Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    Intent data = new Intent();
                    data.putExtra("isLogin", true);
                    data.putExtra("LoginUserName", userName);
                    setResult(RESULT_OK, data);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this, "此用户名不存在,请先注册", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_login_register:
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }
}