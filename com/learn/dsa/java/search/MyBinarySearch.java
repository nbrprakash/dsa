package com.learn.dsa.java.search;

public class MyBinarySearch {

    public void search(int[] array, int element){
        int low = 0;
        int high = array.length;
        int mid=0;
        boolean found = false;
        while(low<(high-1)){
            mid = (low+high)/2;
            if(array[mid] >element){
                high = mid;
            }else if(array[mid] <element){
                low = mid;
            }else if(array[mid] == element){
                found = true;
                break;
            }
        }
        System.out.println("End of search. Element is " + (found? "present at " + (mid+1): "not present"));
    }
}
