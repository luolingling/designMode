package com.luoll.factory.abstruct;

import com.luoll.factory.abstruct.product.InterfaceController;
import com.luoll.factory.abstruct.product.OperationController;
import com.luoll.factory.abstruct.product.SymbianInterfaceController;
import com.luoll.factory.abstruct.product.SymbianOperationController;

/**
 * Created by luolingling on 2017/9/4.
 */
public class SymbianSystemFactory implements SystemFactory {
    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }
}
