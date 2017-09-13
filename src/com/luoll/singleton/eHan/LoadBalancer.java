package com.luoll.singleton.eHan;

/**
 * 饿汉式
 * Created by luolingling on 2017/9/5.
 */
public class LoadBalancer {

    private static LoadBalancer instance = new LoadBalancer();

    private LoadBalancer(){

    }

    public static LoadBalancer getInstance() {
        return instance;
    }
}
