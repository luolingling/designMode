package com.luoll.factory.abstruct;

import com.luoll.factory.abstruct.product.InterfaceController;
import com.luoll.factory.abstruct.product.OperationController;
import com.luoll.factory.abstruct.product.WPInterfaceController;
import com.luoll.factory.abstruct.product.WPOperationController;

/**
 * Created by luolingling on 2017/9/4.
 */
public class WPSystemFactory implements SystemFactory {
    @Override
    public InterfaceController createInterfaceController() {
        return new WPInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new WPOperationController();
    }
}
