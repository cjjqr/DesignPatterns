package com.mashibing.test.strategy;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/12 11:07
 **/
public class Dog implements Comparable<Dog> {

    private Integer weight;

    private Integer food;

    public Dog(Integer weight, Integer food) {
        this.weight = weight;
        this.food = food;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", food=" + food +
                '}';
    }

    @Override
    public int compareTo(Dog d1, Dog d2) {
        if (d1.food < d2.food && d2.weight == d1.weight){
            return -1;
        }else if (d1.food < d2.food && d2.weight == d1.weight){
            return 1;
        }
        return 0;
    }

}
