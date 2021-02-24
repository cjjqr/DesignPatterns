package com.mashibing.test.abstractfactory.demo2;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/24 14:36
 **/
public class TestMain {

    public static void main(String[] args) {
        System.out.println(SingletonFactory.getInstance());
        System.out.println(SingletonFactory.getInstance().hashCode());
        System.out.println(SingletonFactory.getInstance().equals(SingletonFactory.getInstance()));
    }
}
