package com.luoll.chainOfResponsibility;

/**
 * Created by luolingling on 2017/9/8.
 */
public class Client {

    public static void main(String[] args) {

        Director director = new Director();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        director.setApprove(manager);
        manager.setApprove(generalManager);

        director.handleApprove(new LeavePermit("罗玲玲", "看牙医", 2));
        director.handleApprove(new LeavePermit("丫丫", "看牙医", 6));
        director.handleApprove(new LeavePermit("小咪", "看牙医", 15));
        director.handleApprove(new LeavePermit("啦啦", "看牙医", 31));
    }
}
