package com.learn.dsa.java.sorting;

public class MyMergeSort {

    public void sort(Integer[] array){

        this.mergeSort();
        System.out.print("Sorted Array -> ");
        SortUtility.printArray(array);
    }

    private void mergeSort(Integer[] array, int low, int high){
        if(low>=high){
            return;
        }
        int mid = ((low+high)/2);
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);

        merge(array, low, mid, high);
    }

    private void merge(Integer[] array, int low, int mid, int high){

        Integer[] leftArray = new Integer[mid-low+1];
        Integer[] rightArray = new Integer[high-mid];

        for(int i=0; i<leftArray.length; i++){
            leftArray[i] = array[]
        }

    }
}
