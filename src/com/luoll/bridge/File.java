package com.luoll.bridge;

/**
 * Sunny软件公司欲开发一个数据转换工具，
 * 可以将数据库中的数据转换成多种文件格式，
 * 例如txt、xml、pdf等格式，同时该工具需要支持多种不同的数据库。
 * 试使用桥接模式对其进行设计。
 * Created by luolingling on 2017/9/8.
 */
public abstract class File {

    protected DBOperation dbOperation;

    public void setDbOperation(DBOperation dbOperation) {
        this.dbOperation = dbOperation;
    }

    /**
     * 转换数据库中数据为指定格式文件
     */
    public abstract void transformFile();
}
