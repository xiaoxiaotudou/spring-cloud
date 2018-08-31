package com.example.demo;

import com.example.demo.model.FruitFactory;
import com.example.demo.model.ModelOne;
import com.example.demo.model.Orange;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);

        Object modelOneObj = context.getBean("modelOne");

        if (modelOneObj != null) {
            if (modelOneObj instanceof ModelOne) {
                System.out.println("111111");
            } else {
                System.out.println("222222");
            }
        }

        FruitFactory.getInstance(Orange.class.getName()).eat();
    }
}