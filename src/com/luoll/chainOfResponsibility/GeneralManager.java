package com.luoll.chainOfResponsibility;

/**
 * Created by luolingling on 2017/9/8.
 */
public class GeneralManager extends Approve {
    @Override
    public void handleApprove(LeavePermit leavePermit) {
        if (leavePermit.getDays() < 30 && leavePermit.getDays() >= 10) {
            System.out.println("主任审批了" + leavePermit.getName() + "的" + leavePermit.getDays() + "天假期");
        }else if (leavePermit.getDays() > 30){
            System.out.println("请假超过30天，不予批准");
        }
    }
}
