package com.luoll.command.once;

/**
 * Created by luolingling on 2017/9/11.
 */
public class MultiplyCommand extends AbstructCommand {

    private Multiply multiply = new Multiply();

    private int value;

    @Override
    public int execute(int value) {
        this.value = value;
        return multiply.multiply(value);
    }

    @Override
    public int undo() {
        return multiply.multiply(1/value);
    }
}
