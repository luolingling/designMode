package com.luoll.factory.abstruct;

import com.luoll.factory.abstruct.product.AndroidInterfaceController;
import com.luoll.factory.abstruct.product.AndroidOperationController;
import com.luoll.factory.abstruct.product.InterfaceController;
import com.luoll.factory.abstruct.product.OperationController;

/**
 * Created by luolingling on 2017/9/4.
 */
public class AndroidSystemFactory implements SystemFactory {
    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }
}
