package com.luoll.singleton.lanHan;

/**
 * 带双重检查锁定机制的懒汉式单例
 * Created by luolingling on 2017/9/5.
 */
public class LoadBalancer {

    private static LoadBalancer instance = null;

    private LoadBalancer(){

    }

//    public static LoadBalancer getInstance() {
//        if (instance == null) {
//            instance = new LoadBalancer();
//        }
//        return instance;
//    }

    public static LoadBalancer getInstance() {
        if (instance == null) {
            synchronized (LoadBalancer.class) {
                if (instance == null) {
                    instance = new LoadBalancer();
                }
            }
        }
        return instance;
    }
}
