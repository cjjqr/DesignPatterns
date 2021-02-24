package com.mashibing.test.abstractfactory.demo1;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/24 14:36
 **/
public class TestMain {

    public static void main(String[] args) {
        Product product = ProductFactory.createProduct("123");
        Product product1 = ProductFactory.createProduct("Product1");
        Product product2 = ProductFactory.createProduct("Product1");
        System.out.println(product.equals(product1));
        System.out.println(product1.equals(product2));
    }
}
