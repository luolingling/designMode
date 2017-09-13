package com.luoll.prototype;

import java.io.Serializable;

/**
 * Created by luolingling on 2017/9/5.
 */
public class Address implements Serializable{

    private String province;

    private String area;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
