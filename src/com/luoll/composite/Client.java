package com.luoll.composite;

/**
 * Created by luolingling on 2017/9/8.
 */
public class Client {

    public static void main(String[] args) {
        Window window = new Window("编辑",1,1);
        Frame frame = new Frame("选择商品", 100, 200);
        Button saveBtn = new Button("保存", 300, 400);
        Button closeBtn = new Button("关闭", 350, 400);

        TextArea des = new TextArea("描述", 200, 300);

        frame.add(des);
        frame.add(saveBtn);
        frame.add(closeBtn);
        window.add(frame);

        window.draw();
    }
}
