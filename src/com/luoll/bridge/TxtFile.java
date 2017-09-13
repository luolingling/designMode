package com.luoll.bridge;

/**
 * Created by luolingling on 2017/9/8.
 */
public class TxtFile extends File {
    @Override
    public void transformFile() {
        String date = dbOperation.getDate();
        System.out.println(date + " 转换为txt文件");
    }
}
