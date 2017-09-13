package com.luoll.singleton.IoDH;

/**
 * IoDH技术
 * Created by luolingling on 2017/9/5.
 */
public class LoadBalancer {


    private LoadBalancer(){

    }

    private static class HolderClass {
        private static final LoadBalancer instance = new LoadBalancer();
    }

    public static LoadBalancer getInstance() {
        return HolderClass.instance;
    }
}
