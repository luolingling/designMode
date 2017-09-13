package com.luoll.command.once;

/**
 * 乘法处理类
 * Created by luolingling on 2017/9/11.
 */
public class Multiply {

    private int num = 1;

    public int multiply(int value) {
        num *= value;
        return num;
    }
}
