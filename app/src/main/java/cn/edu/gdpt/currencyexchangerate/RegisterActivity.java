package cn.edu.gdpt.currencyexchangerate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import cn.edu.gdpt.currencyexchangerate.ee.DBUtils;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img_register_de;
    private ImageView img_login_title;
    private EditText edt_register_name;
    private EditText edt_register_password1;
    private Button btn_register_register;
    private String userName,psw,pswAgain;
    private DBUtils dbUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        dbUtils=new DBUtils(this);
        initView();
    }

    private void initView() {
        img_register_de = (ImageView) findViewById(R.id.img_register_de);
        img_login_title = (ImageView) findViewById(R.id.img_login_title);
        edt_register_name = (EditText) findViewById(R.id.edt_register_name);
        edt_register_password1 = (EditText) findViewById(R.id.edt_register_password1);
        btn_register_register = (Button) findViewById(R.id.btn_register_register);

        img_register_de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterActivity.this.finish();
            }
        });

        btn_register_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_register_register:
                userName = edt_register_name.getText().toString().trim();
                psw = edt_register_password1.getText().toString().trim();
                if (TextUtils.isEmpty(userName)) {
                    Toast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show();
                    return;
                } else if (TextUtils.isEmpty(psw)) {
                    Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;
                } else if (dbUtils.userIsExist(userName)) {
                    Toast.makeText(RegisterActivity.this, "此账号名已经存在", Toast.LENGTH_SHORT).show();
                    return;
                } else if (dbUtils.userRegister(userName, psw)) {
                    Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    RegisterActivity.this.finish();
                } else {
                    Toast.makeText(RegisterActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
                }
                break;
        }


    }
}

