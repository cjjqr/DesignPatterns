package com.mashibing.test.abstractfactory.demo2;

import java.lang.reflect.Constructor;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/24 11:56
 **/
public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class<?> aClass = Class.forName(Singleton.class.getName());
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstance(){
        return singleton;
    }



}
