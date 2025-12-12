package com.learn.dsa.java.search;

public class SearchTest {

    public static void main(String[] args){
        int[] array = {10, 45, 50, 67};

//        new SearchTest().linearSearch();
        new SearchTest().binarySearch();
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

}
