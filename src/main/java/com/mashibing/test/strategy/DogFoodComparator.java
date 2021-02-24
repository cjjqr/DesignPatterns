package com.mashibing.test.strategy;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/12 13:41
 **/
public class DogFoodComparator implements Comparator<Dog>{


    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getFood() < o2.getFood()){
            return -1;
        }else if (o1.getFood() > o2.getFood()){
            return 1;
        }
        return 0;
    }
}
