package com.mashibing.test.strategy;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/12 13:40
 **/
public interface Comparator<T> {

    int compare(T o1, T o2);
}
