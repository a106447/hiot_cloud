package com.example.hiot_cloud.mvptest;

import com.example.hiot_cloud.test.mvptest.model.User;

public class TestPresenter {

    private com.example.hiot_cloud.test.mvptest.TestView view;

    public TestPresenter(com.example.hiot_cloud.test.mvptest.TestView view) {
        this.view = view;
    }

    public void login(User user){
        if ("list".equals(user.getUserName()) && "123".equals(user.getPassword())){
            view.showMessage("登录成功");
        }else {
            view.showMessage("登录失败");
        }
    }
}
