package com.learn.dsa.java.sorting;

public class MySelectionSort {

    public void sort(Integer[] array){

        int smallest;
        int smallestPos;
        int temp;
        for(int i=0; i<array.length-1; i++){
            smallest = array[i];
            smallestPos = i;
            for(int j=i; j<array.length; j++){
                if(array[j] <smallest){
                    smallest = array[j];
                    smallestPos = j;
                }
            }
            if(i != smallestPos){
                temp = array[i];
                array[i] = array[smallestPos];
                array[smallestPos] = temp;
            }

            System.out.print("Partilly Sorted Array -> ");
            SortUtility.printArray(array);
        }

        System.out.print("Sorted Array -> ");
        SortUtility.printArray(array);
    }
}
