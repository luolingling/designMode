package com.luoll.chainOfResponsibility;

/**
 * Created by luolingling on 2017/9/8.
 */
public class Director extends Approve {

    @Override
    public void handleApprove(LeavePermit leavePermit) {
        if (leavePermit.getDays() < 3) {
            System.out.println("主任审批了" + leavePermit.getName() + "的" + leavePermit.getDays() + "天假期");
        }else {
            approve.handleApprove(leavePermit);
        }
    }
}
