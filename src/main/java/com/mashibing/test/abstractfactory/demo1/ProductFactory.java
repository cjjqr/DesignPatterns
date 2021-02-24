package com.mashibing.test.abstractfactory.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/24 14:25
 **/
public class ProductFactory {

    private static final Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type){
        if (prMap.containsKey(type)){
            return prMap.get(type);
        }
        Product product = null;
        if ("Product1".equals(type)){
            product = new ConcreteProduct1();
        }else {
            product = new ConcreteProduct2();
        }
        prMap.put(type, product);
        return product;
    }


}
