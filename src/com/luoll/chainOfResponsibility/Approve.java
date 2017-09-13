package com.luoll.chainOfResponsibility;

/**
 * Sunny软件公司的OA系统需要提供一个假条审批模块：
 * 如果员工请假天数小于3天，主任可以审批该假条；
 * 如果员工请假天数大于等于3天，小于10天，经理可以审批；
 * 如果员工请假天数大于等于10天，小于30天，总经理可以审批；
 * 如果超过30天，总经理也不能审批，提示相应的拒绝信息。
 * 试用职责链模式设计该假条审批模块
 * Created by luolingling on 2017/9/8.
 */
public abstract class Approve {

    protected Approve approve;

    public void setApprove(Approve approve) {
        this.approve = approve;
    }

    public abstract void handleApprove(LeavePermit leavePermit);
}
