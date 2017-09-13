package com.luoll.factory.abstruct.product;

/**
 * Created by luolingling on 2017/9/4.
 */
public class SymbianOperationController implements OperationController {
    @Override
    public void init() {
        System.out.println("塞班系统手机——操作控制初始化。。。");
    }
}
