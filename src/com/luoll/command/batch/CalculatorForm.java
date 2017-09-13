package com.luoll.command.batch;

/**
 * Created by luolingling on 2017/9/11.
 */
public class CalculatorForm {

    private CommandQueue commandQueue;

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void execute(int value) {
        int i = commandQueue.execute(value);
        System.out.println("执行运算，运算结果为：" + i);
    }

    public void undo() {
        int i =commandQueue.undo();
        System.out.println("执行撤销，运算结果为：" + i);
    }

    public void redo() {
        int i =commandQueue.redo();
        System.out.println("执行取消撤销，运算结果为：" + i);
    }
}
