package com.luoll.command.once;

/**
 * 加法操作命令类
 * Created by luolingling on 2017/9/11.
 */
public class AdderCommand extends AbstructCommand {

    private Adder adder = new Adder();

    private int value;


    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
