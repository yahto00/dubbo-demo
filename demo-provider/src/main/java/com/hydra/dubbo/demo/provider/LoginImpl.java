package com.hydra.dubbo.demo.provider;

import com.hydra.dubbo.demo.api.Login;

/**
 * Created by yahto on 26/12/2017
 */
public class LoginImpl implements Login {
    @Override
    public boolean isLogin(String userName, String password) {
        if (userName == null || password == null) {
            return false;
        }
        if (userName.length() > password.length()) {
            return true;
        }
        return false;
    }
}
