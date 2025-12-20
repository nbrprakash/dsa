package com.learn.dsa.java.search;

public class MyJumpSearch {

    public void search(int[] array, int element, int jumpSize){

        if((array[0] >element) || (array[array.length-1] <element)){
            System.out.println("The element is not found.");
            return;
        }
        int iCounter=0;
        boolean linearSearchMarker = false;
        while(iCounter<array.length){
            if(array[iCounter] <element){
                iCounter += jumpSize;
            }else if(array[iCounter] == element){
                System.out.println("Element Found at location " + (iCounter+1));
                return;
            }else {
                linearSearchMarker = true;
                break;
            }
        }

        if(linearSearchMarker == true){

            for(int i=iCounter; i>(iCounter-jumpSize); i--){
                if(array[i] == element){
                    System.out.println("Element Found at location " + (i+1));
                    return;
                }
            }
        }

        System.out.println("The element is not found.");
    }
}
