package com.luoll.factory.abstruct.product;

/**
 * Created by luolingling on 2017/9/4.
 */
public class AndroidInterfaceController implements InterfaceController {
    @Override
    public void init() {
        System.out.println("安卓系统手机——界面控制初始化。。。");
    }
}
