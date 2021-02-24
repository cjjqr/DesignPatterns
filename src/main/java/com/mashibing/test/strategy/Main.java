package com.mashibing.test.strategy;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/11 18:59
 **/
public class Main {

    public static void main(String[] args) {
//        comparable();
        comparator();
    }

    public static void comparable(){
        Cat[] cats = {new Cat(1),new Cat(3),new Cat(5)};
        Dog[] dogs = {new Dog(1,2),new Dog(1,3),new Dog(1,5)};
        Sorter_Comparable.sort(dogs);
        for (Dog animal : dogs) {
            System.out.println(animal);
        }
    }

    public static void comparator(){
        Dog[] dogs = {new Dog(1,5),new Dog(6,8),new Dog(4,2)};
        Sorter_Comparator.sort(dogs,new DogFoodComparator());
        for (Dog animal : dogs) {
            System.out.println(animal);
        }
    }
}
