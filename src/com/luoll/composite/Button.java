package com.luoll.composite;

/**
 * Created by luolingling on 2017/9/8.
 */
public class Button extends AbstractControls {

    private String name;

    private int x;

    private int y;

    public Button(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("在X=" + x + ", Y=" + y + "位置画按钮" + name);
    }
}
