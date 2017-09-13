package com.luoll.command.once;

/**
 * 抽象命令类
 * Created by luolingling on 2017/9/11.
 */
public abstract class AbstructCommand {

    //声明命令执行方法execute()
    public abstract int execute(int value);

    //声明撤销方法undo()
    public abstract int undo();
}
