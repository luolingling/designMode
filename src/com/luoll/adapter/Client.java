package com.luoll.adapter;

/**
 * Created by luolingling on 2017/9/5.
 */
public class Client {

    public static void main(String[] args) {
        DBOperation dbOpreation = new OperationAdapter();

        dbOpreation.savePassword("123456");
    }
}
