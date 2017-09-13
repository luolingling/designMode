package com.luoll.singleton.IoDH;

/**
 * Created by luolingling on 2017/9/5.
 */
public class Client {

    public static void main(String[] args) {
        LoadBalancer loadBalancer1 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer2 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer3 = LoadBalancer.getInstance();

        System.out.println(loadBalancer1 == loadBalancer2 && loadBalancer1 == loadBalancer3 && loadBalancer2 == loadBalancer3);
    }
}
