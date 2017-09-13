package com.luoll.singleton.lanHan;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by luolingling on 2017/9/5.
 */
public class Client {

    public static void main(String[] args) {
        Set<LoadBalancer> loadBalancers = new HashSet<LoadBalancer>();
        for (int i = 0; i < 1000; i++) {
            loadBalancers.add(LoadBalancer.getInstance());
        }

        System.out.println(loadBalancers.size());
    }
}
