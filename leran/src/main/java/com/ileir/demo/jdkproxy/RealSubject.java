package com.ileir.demo.jdkproxy;

/**
 * @author: zihailei
 * @description:
 * @date: 2019/11/14 16:50
 **/
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("RealSubject do something");
    }
}
