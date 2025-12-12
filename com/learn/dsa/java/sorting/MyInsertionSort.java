package com.learn.dsa.java.sorting;

public class MyInsertionSort {

    public void sort(Integer[] array){

        for(int i=1; i<array.length; i++){
            int chosen = array[i];
            int pos=i;

            for(int j=0;j<i;j++){
                if(array[j] >chosen){
                    pos =j;
                    break;
                }
            }

            for(int k=i; k>pos; k--){
                array[k] = array[k-1];
            }
            array[pos] = chosen;

            System.out.print("Partilly Sorted Array -> ");
            SortUtility.printArray(array);
        }
    }
}
