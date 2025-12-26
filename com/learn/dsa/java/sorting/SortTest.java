package com.learn.dsa.java.sorting;


public class SortTest {
    public static void main(String[] args){

//        new SortTest().bubbleSort();
//        new SortTest().selectionSort();
//        new SortTest().insertionSort();
//        new SortTest().quickSort();
//        new SortTest().mergeSort();
        new SortTest().radixSort();
    }

    public void bubbleSort(){
        Integer[] array = {10, 6, 90, 67};
        new MyBubbleSort().sort(array);
    }

    public void selectionSort(){
        Integer[] array = {10, 6, 90, 67, 1, 15, 5, 12};
        new MySelectionSort().sort(array);
    }

    public void insertionSort(){
        Integer[] array = {10, 6, 90, 67, 1, 15, 5, 12};
        new MyInsertionSort().sort(array);
    }

    public void quickSort(){
//        Integer[] array = {5, 3, 8, 4, 2, 7, 1, 10};
//        Integer[] array = {10, 6, 90, 67, 1, 15, 5, 12};
        Integer[] array = {1, 2, 3, 1, 5, 6, 8, 7};
        new MyQuickSort().sort(array);
    }

    public void mergeSort(){
        Integer[] array = {10, 6, 90, 15, 1, 15, 5};

        new MyMergeSort().sort(array);
    }

    public void radixSort(){
        Integer[] array = {10, 6, 90, 15, 1, 15, 5};

        new MyRadixSort().sort(array);
    }


}
