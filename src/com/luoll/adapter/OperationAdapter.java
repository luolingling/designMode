package com.luoll.adapter;

import sun.misc.BASE64Encoder;

/**
 * Created by luolingling on 2017/9/5.
 */
public class OperationAdapter extends DBOperation {
    private BASE64Encoder encoder;

    public OperationAdapter() {
        this.encoder = new BASE64Encoder();
    }

    public void savePassword(String password) {
        encoder.encode(password.getBytes());
        System.out.println("加密保存密码...");
    }
}
