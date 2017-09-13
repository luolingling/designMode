package com.luoll.command.batch;

/**
 * 抽象命令类
 * Created by luolingling on 2017/9/11.
 */
public abstract class AbstractCommand{

    /**
     * 操作状态 1-正常  2-撤销
     */
    protected int status;

    //声明命令执行方法execute()
    public abstract int execute(int value);

    //声明撤销方法undo()
    public abstract int undo();

    //声明取消撤销方法undo()
    public abstract int redo();

    public abstract AbstractCommand copy();
}
