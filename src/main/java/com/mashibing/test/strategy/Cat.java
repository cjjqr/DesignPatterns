package com.mashibing.test.strategy;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/11 18:41
 **/
public class Cat implements Comparable<Cat> {

    private Integer weight;

    public Cat(Integer weight){
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat c1,Cat c2) {
        if (c1.weight < c2.weight){
            return -1;
        }else if (c1.weight > c2.weight){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
