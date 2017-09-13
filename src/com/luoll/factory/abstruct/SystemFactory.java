package com.luoll.factory.abstruct;

import com.luoll.factory.abstruct.product.InterfaceController;
import com.luoll.factory.abstruct.product.OperationController;

/**
 * Created by luolingling on 2017/9/4.
 */
public interface SystemFactory {

    public InterfaceController createInterfaceController();

    public OperationController createOperationController();
}
