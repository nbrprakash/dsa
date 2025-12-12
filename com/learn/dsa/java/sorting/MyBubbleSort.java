package com.learn.dsa.java.sorting;

public class MyBubbleSort {

    public void sort(Integer[] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<i; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array -> ");
        SortUtility.printArray(array);
    }
}
