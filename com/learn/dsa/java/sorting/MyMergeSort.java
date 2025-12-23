package com.learn.dsa.java.sorting;

public class MyMergeSort {

    public void sort(Integer[] array){

        this.mergeSort(array, 0, array.length-1);
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

        int leftSize = mid-low+1;
        int rightSize = high-mid;
        Integer[] leftArray = new Integer[leftSize];
        Integer[] rightArray = new Integer[rightSize];

        for(int i=0; i<leftSize; i++){
            leftArray[i] = array[low+i];
        }

        for(int i=0; i<rightSize; i++){
            rightArray[i] = array[mid+i+1];
        }

        int i=0, j=0;
        int k=low;
        while((i<leftSize) && (j<rightSize)){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<leftSize){
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<rightSize){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
