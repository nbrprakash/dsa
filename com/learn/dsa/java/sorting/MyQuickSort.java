package com.learn.dsa.java.sorting;

public class MyQuickSort {

    public void sort(Integer[] array){

        this.quicksort(array, 0, array.length-1);
        System.out.print("Sorted Array -> ");
        SortUtility.printArray(array);
    }

    private void quicksort(Integer[] array, int low, int high){
        int partition;

        if(low<high){
            partition = hoarePartition(array, low, high);
            quicksort(array, low, partition-1);
            quicksort(array, partition+1, high);
        }
    }

    private int hoarePartition (Integer[] array, int low, int high){
        //Step-1: Choose a pivot
//        int pivot = array[low];
        int pivot = array[high];

        //Step-2: Declare 2 markers for either end of the array limits
        int i= low;
        int j = high;
        int temp;

        //Step-6: Repeat the Steps 3, 4 and 5 in a loop.
        while(true){
            //Step-3: Keep increasing left marker (i) as long as the values are less than pivot
            // You will end at the first value equal or greater than pivot;
            while(array[i]<pivot){
                i++;
            }

            //Step-4: Keep decreasing right marker (j) as long as the values is greater than pivot
            // You will end at the first value equal or less than pivot;
            while(array[j] >pivot){
                j--;
            }

            //Step-5: If left marker is less than right marker, Swap the elements otherwise return the partition location
            // You are moving bigger element to the right and smaller element to the left
            if(i<j){
                //swap
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }else{
                return j;
            }
        }
    }
}