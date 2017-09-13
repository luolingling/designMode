package com.luoll.chainOfResponsibility;

/**
 * Created by luolingling on 2017/9/8.
 */
public class LeavePermit {

    private String name;

    private String content;

    private int days;

    public LeavePermit(String name, String content, int days) {
        this.name = name;
        this.content = content;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
