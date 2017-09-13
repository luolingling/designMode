package com.luoll.command.batch;

/**
 * 加法操作命令类
 * Created by luolingling on 2017/9/11.
 */
public class AdderCommand extends AbstractCommand implements Cloneable{

    private Adder adder = new Adder();

    private int value;

    @Override
    public int execute(int value) {
        this.value = value;
        this.status = 1;
        return adder.add(value);
    }

    @Override
    public int undo() {
        this.status = 2;
        return adder.add(-value);
    }

    @Override
    public int redo() {
        this.status = 1;
        return adder.add(value);
    }

    public AdderCommand copy() {
        Object obj = null;

        try {
            obj = super.clone();
            return (AdderCommand) obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
