package com.luoll.prototype;

import java.io.IOException;
import java.util.Date;

/**
 * Created by luolingling on 2017/9/5.
 */
public class Client {

    public static void main(String[] args) {
        Address address = new Address();
        address.setProvince("江苏省");
        address.setArea("南京市");

        Customer customer = new Customer();
        customer.setName("lalal");
        customer.setAddress(address);
        customer.setActTime(new Date());
        customer.setAge(24);
        System.out.println(customer);

        Customer customer1 = customer.copy();
        System.out.println(customer1);
        System.out.println(customer.getName() == customer1.getName());
        System.out.println(customer.getActTime() == customer1.getActTime());
        System.out.println(customer.getAddress() == customer1.getAddress());
        System.out.println(customer.getAge() == customer1.getAge());
        System.out.println("=====================");

        try {
            Customer customer2 = customer.deepCopy();
            System.out.println(customer2);
            System.out.println(customer.getName() == customer2.getName());
            System.out.println(customer.getActTime() == customer2.getActTime());
            System.out.println(customer.getAddress() == customer2.getAddress());
            System.out.println(customer.getAge() == customer2.getAge());
            System.out.println("=====================");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
