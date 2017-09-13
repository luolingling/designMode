package com.luoll.command.once;

/**
 * 加法类：请求接受者
 * Created by luolingling on 2017/9/11.
 */
public class Adder {

    private int num = 0;

    public int add(int value) {
        num += value;
        return num;
    }

}
