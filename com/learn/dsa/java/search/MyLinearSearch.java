package com.learn.dsa.java.search;

public class MyLinearSearch {

    public void search(int[] array, int element){
        for(int i=0; i<array.length;i++){
            if(array[i] == element){
                System.out.println("Element Found at location " + (i+1));
                return;
            }
        }
        System.out.println("The element is not found.");
    }
}
