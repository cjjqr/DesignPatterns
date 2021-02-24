package com.mashibing.test.strategy;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/11 18:47
 **/
public class Sorter_Comparator {

    public static <T> void sort(T[] arr,Comparator<T> comparator){
        for (int i = 0; i < arr.length -1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = comparator.compare(arr[i], arr[j]) == -1 ? j : minPos;
                if (j == minPos){
                    swap(arr,i,minPos);
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
