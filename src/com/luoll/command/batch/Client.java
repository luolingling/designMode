package com.luoll.command.batch;

/**
 * 修改简易计算器源代码，使之能够实现多次撤销(Undo)和恢复(Redo)。
 * Created by luolingling on 2017/9/11.
 */
public class Client {

    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();
        CommandQueue commandQueue = new CommandQueue();
        AdderCommand adderCommand = new AdderCommand();
        commandQueue.setCommand(adderCommand);
        calculatorForm.setCommandQueue(commandQueue);

        calculatorForm.execute(10);
        calculatorForm.execute(4);
        calculatorForm.execute(32);
        calculatorForm.execute(16);
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.redo();
        calculatorForm.redo();
        calculatorForm.redo();
        calculatorForm.execute(20);
    }
}
