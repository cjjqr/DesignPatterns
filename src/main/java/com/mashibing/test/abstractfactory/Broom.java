package com.mashibing.test.abstractfactory;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/12 20:32
 **/
public class Broom implements Moveble {
    @Override
    public void go() {
        System.out.println("broom flying chuachuachua...");
    }
}
