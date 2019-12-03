package com.ileir.demo;

import com.ileir.demo.jdkproxy.JDKDynamicProxy;
import com.ileir.demo.jdkproxy.RealSubject;
import com.ileir.demo.jdkproxy.Subject;
import com.ileir.demo.spi.Robot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Proxy;
import java.util.ServiceLoader;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // jdk动态代理测试
        RealSubject realSubject = new RealSubject();
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), jdkDynamicProxy);
        subject.doSomething();

        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);


    }

}
