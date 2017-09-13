package com.luoll.command.once;

/**
 * Created by luolingling on 2017/9/11.
 */
public class CalculatorForm {

    private AbstructCommand command;

    public void setCommand(AbstructCommand command) {
        this.command = command;
    }

    public void execute(int value) {
        int i = command.execute(value);
        System.out.println("执行运算，运算结果为：" + i);
    }

    public void undo() {
        int i = command.undo();
        System.out.println("执行撤销，运算结果为：" + i);
    }
}
