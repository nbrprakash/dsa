package com.learn.dsa.java.list.circularDoublyLinkedList;

public class MyCircularDoublyLinkedListTest {

    public static void main(String[] args){
        MyCircularDoublyLinkedListTest cdllt = new MyCircularDoublyLinkedListTest();
//        llt.testCollectionsImplementation();
        cdllt.testCustomImplementation();
    }

    public void testCollectionsImplementation(){

    }

    public void testCustomImplementation(){

        MyCircularDoublyLinkedList cdll = new MyCircularDoublyLinkedList();
        cdll.display(true);
        cdll.display(false);

        cdll.addNode(10);
        cdll.display(true);
        cdll.display(false);

        cdll.remove(10);
        cdll.display(true);
        cdll.display(false);

        cdll.addNode(20);
        cdll.display(true);
        cdll.display(false);

        cdll.addNode(30);
        cdll.display(true);
        cdll.display(false);

        cdll.addFirst(40);
        cdll.display(true);
        cdll.display(false);

        cdll.addNode(50);
        cdll.display(true);
        cdll.display(false);

        cdll.remove(30);
        cdll.display(true);
        cdll.display(false);

        cdll.remove(50);
        cdll.display(true);
        cdll.display(false);
    }
}
