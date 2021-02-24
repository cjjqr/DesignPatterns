package com.mashibing.test.strategy;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/11 18:47
 **/
public class Sorter_Comparable {

    public static <T> void sort(Comparable[] comparable){
        for (int i = 0; i < comparable.length -1; i++) {
            int minPos = i;
            for (int j = i+1; j < comparable.length; j++) {
                minPos = comparable[j].compareTo(comparable[i], comparable[j]) == -1 ? j : minPos;
                if (j == minPos){
                    swap(comparable,i,minPos);
                }
            }
        }
    }

    public static  <T> void swap(T[] arr,int i,int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
