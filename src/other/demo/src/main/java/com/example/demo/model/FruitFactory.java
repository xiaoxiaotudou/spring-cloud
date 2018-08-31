package com.example.demo.model;

import java.lang.reflect.Method;

public class FruitFactory {

    public static Fruit getInstance(String className) {
        Fruit fruit = null;
        try {
            fruit = (Fruit)Class.forName(className).newInstance();

            Class fruitCls = Class.forName(className);
            Method method = fruitCls.getMethod("eat");
            method.invoke(fruitCls.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fruit;
    }
}