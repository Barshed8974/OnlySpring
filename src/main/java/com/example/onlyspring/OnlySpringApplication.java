package com.example.onlyspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OnlySpringApplication {
    private static ApplicationContext context;
    @Autowired
    static MyClass myClass;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("bean.xml");

        Employee e = (Employee) context.getBean("manager");
        e.doWork();
        myClass.fun();
    }
}
