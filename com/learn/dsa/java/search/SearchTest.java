package com.learn.dsa.java.search;

public class SearchTest {

    public static void main(String[] args){
        int[] array = {10, 45, 50, 67};

//        new SearchTest().linearSearch();
//        new SearchTest().binarySearch();
//        new SearchTest().jumpSearch();
        new SearchTest().fibonacciSearch();
    }

    private void linearSearch(){
        int[] array = {10, 7, 50, 67, 12};

        new MyLinearSearch().search(array, 50);
        new MyLinearSearch().search(array, 90);
    }

    private void binarySearch(){
        int[] array = {10, 45, 50, 67};

        new MyBinarySearch().search(array, 45);
        new MyBinarySearch().search(array, 90);
    }

    private void jumpSearch(){
        int[] array = {10, 22, 24, 28, 31, 34, 39, 42, 45, 47, 50, 54, 58, 67, 71, 74, 77, 88, 90, 96, 99};

        new MyJumpSearch().search(array, 45, 2);
        new MyJumpSearch().search(array, 50, 2);
        new MyJumpSearch().search(array, 57, 2);
        new MyJumpSearch().search(array, 10, 2);
        new MyJumpSearch().search(array, 5, 2);
        new MyJumpSearch().search(array, 99, 2);
        new MyJumpSearch().search(array, 104, 2);
    }

    private void fibonacciSearch(){
        int[] array = {10, 22, 24, 28, 31, 34, 39, 42, 45, 47, 50, 54, 58, 67, 71, 74, 77, 88, 90, 96, 99};

        new MyFibonacciSearch().search(array, 47);
    }

}
