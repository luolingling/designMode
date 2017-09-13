package com.luoll.bridge;

/**
 * Created by luolingling on 2017/9/8.
 */
public class MysqlDBOperation implements DBOperation {
    @Override
    public String getDate() {
        System.out.println("mysql数据库获取数据");
        return "hello";
    }
}
