package com.luoll.command.once;

/**
 * Created by luolingling on 2017/9/11.
 */
public class Client {

    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AdderCommand adderCommand = new AdderCommand();
        form.setCommand(adderCommand);

        form.execute(2);
        form.execute(10);
        form.execute(3);
        form.execute(5);
        form.undo();
        form.undo();

        MultiplyCommand multiplyCommand = new MultiplyCommand();
        form.setCommand(multiplyCommand);
        form.execute(2);
        form.execute(10);
        form.execute(3);
        form.execute(5);
        form.undo();
        form.undo();
    }
}
