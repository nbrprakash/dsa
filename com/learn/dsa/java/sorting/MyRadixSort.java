package com.learn.dsa.java.sorting;

import java.util.Arrays;

public class MyRadixSort {
    public void sort(Integer[] array){

        int max = findMax(array);
        for(int exp = 1; max/exp>0; exp*=10){
            countSort(array, exp);
        }

        System.out.print("Sorted Array -> ");
        SortUtility.printArray(array);
    }

    private int findMax(Integer[] array){
        int max = array[0];

        for(Integer a: array){
            if(a>max){
                max = a;
            }
        }
        return max;
    }

    private void countSort(Integer[] array, int exp){
        Integer[] output = new Integer[array.length];
        int[] count = new int[10];

        Arrays.fill(count,0);
        for(int i=0;i<array.length; i++) {
            count[array[i] / exp % 10]++;
        }

        for(int i=1;i<10;i++) {
            count[i] += count[i-1];
        }

        for(int i= array.length-1; i>=0; i--){
            output[count[(array[i]/exp)%10] -1] = array[i];
            count[(array[i]/exp) %10]--;
        }

        for(int i=0; i<array.length; i++){
            array[i] = output[i];
        }
    }

}
