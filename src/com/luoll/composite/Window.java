package com.luoll.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luolingling on 2017/9/8.
 */
public class Window extends AbstractControls {

    private List<AbstractControls> list = new ArrayList<>();

    private String name;

    private int x;

    private int y;

    public Window(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void add (AbstractControls controls) {
        list.add(controls);
    }

    public void remove (AbstractControls controls) {
        list.remove(controls);
    }

    public AbstractControls getChild(int i) {
        return list.get(i);
    }

    @Override
    public void draw() {
        System.out.println("在X=" + x + ", Y=" + y + "位置画窗体" + name);

        for (AbstractControls controls : list) {
            controls.draw();
        }
    }
}
