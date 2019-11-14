package com.ileir.demo.spi;

/**
 * @author: zihailei
 * @description:
 * @date: 2019/10/23 17:50
 **/
public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}
