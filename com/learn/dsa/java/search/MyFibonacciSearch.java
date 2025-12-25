package com.learn.dsa.java.search;

public class MyFibonacciSearch {

    public void search(int[] array, int element) {

        int length = array.length;
        int f1=0, f2=1, f3 = f1+f2;

        while(f3<array.length){
            f1=f2;
            f2=f3;
            f3=f1+f2;
        }

        int offset =-1;
        int index=-1;
        boolean found = false;
        while(f3>1) {
            index = Math.min(offset + f1, length - 1);

            if (array[index] < element) {
                f3 = f2;
                f2 = f1;
                f1 = f3 - f2;
                offset = index;
            } else if (array[index] > element) {
                f3 = f1;
                f2 = f2 - f1;
                f1 = f3 - f2;
            } else if (array[index] == element) {
                found = true;
                break;
            }
        }

        if(found == true){
            System.out.println("Element found at location:" + (index+1));
        }else{
            if((f2!=0) && (array[offset+1] == element)){
                System.out.println("Element found at location:" + (offset+2));
            }else{
                System.out.println("Element not found.");
            }
        }

    }
}
