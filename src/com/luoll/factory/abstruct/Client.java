package com.luoll.factory.abstruct;

import com.luoll.factory.abstruct.product.InterfaceController;
import com.luoll.factory.abstruct.product.OperationController;
import com.luoll.utils.XMLUtil;

/**
 *
 * Sunny软件公司欲推出一款新的手机游戏软件，
 * 该软件能够支持Symbian、Android和Windows Mobile等多个智能手机操作系统平台，
 * 针对不同的手机操作系统，该游戏软件提供了不同的游戏操作控制(OperationController)类
 * 和游戏界面控制(InterfaceController)类，并提供相应的工厂类来封装这些类的初始化过程。
 * 软件要求具有较好的扩展性以支持新的操作系统平台，为了满足上述需求，试采用抽象工厂模式对其进行设计。
 *
 * Created by luolingling on 2017/9/4.
 */
public class Client {

    public static void main(String[] args) {
        SystemFactory systemFactory = (SystemFactory) XMLUtil.getBean("D:/spaceOfPractice/DesignMode/src/com/luoll/factory/abstruct/config/config.xml");

        InterfaceController interfaceController = systemFactory.createInterfaceController();
        interfaceController.init();

        OperationController operationController = systemFactory.createOperationController();
        operationController.init();

    }
}
