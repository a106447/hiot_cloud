package com.example.hiot_cloud.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hiot_cloud.R;
import com.example.hiot_cloud.test.mvptest.model.User;

public class testMVPActivity extends AppCompatActivity implements com.example.hiot_cloud.test.mvptest.TestView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvp);
        final EditText etUserName = findViewById(R.id.tv_user_name);
        final EditText etPassword = findViewById(R.id.tv_password);
        Button btnLogin = findViewById(R.id.btn_login);
        final User user = new User();
        final TestPresenter presenter = new TestPresenter(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setUserName(etUserName.getText().toString());
                user.setPassword(etPassword.getText().toString());
                presenter.login(user);
            }
        });
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}