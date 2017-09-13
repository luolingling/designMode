package com.luoll.composite;

/**
 * Created by luolingling on 2017/9/8.
 */
public class TextArea extends AbstractControls {

    private String name;

    private int x;

    private int y;

    public TextArea(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("在X=" + x + ", Y=" + y + "位置画文本框" + name);
    }
}
