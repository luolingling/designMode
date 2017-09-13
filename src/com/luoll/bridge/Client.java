package com.luoll.bridge;

/**
 * Created by luolingling on 2017/9/8.
 */
public class Client {

    public static void main(String[] args) {
        MysqlDBOperation mysqlDBOperation = new MysqlDBOperation();
        TxtFile txtFile = new TxtFile();
        txtFile.setDbOperation(mysqlDBOperation);
        txtFile.transformFile();

        OracleDBOperation oracleDBOperation = new OracleDBOperation();
        txtFile.setDbOperation(oracleDBOperation);
        txtFile.transformFile();
    }
}
