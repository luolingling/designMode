package com.luoll.factory.abstruct.product;

/**
 * Created by luolingling on 2017/9/4.
 */
public class WPOperationController implements OperationController {
    @Override
    public void init() {
        System.out.println("WP系统手机——操作控制初始化。。。");
    }
}
