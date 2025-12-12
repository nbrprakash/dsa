package com.learn.dsa.java.list.circularLinkedList;


public class MyCircularLinkedListTest {

    public static void main(String[] args){
        MyCircularLinkedListTest cllt = new MyCircularLinkedListTest();
//        llt.testCollectionsImplementation();
        cllt.testCustomImplementation();
    }

    public void testCollectionsImplementation(){

    }

    public void testCustomImplementation(){
        MyCircularLinkedList cll = new MyCircularLinkedList();
        cll.display();
        cll.addFirst(10);
        cll.display();
        cll.addFirst(20);
        cll.display();
        cll.addFirst(30);
        cll.display();

        cll.addLast(40);
        cll.display();
        cll.addLast(50);
        cll.display();

        cll.addAfter( 25,  20);
        cll.display();
        cll.addAfter( 55,  50);
        cll.display();
        cll.addAfter( 35,  30);
        cll.display();

        cll.addBefore(32, 30);
        cll.display();
        cll.addBefore(37, 30);
        cll.display();

        cll.removeFirst();
        cll.display();

        cll.removeFirst();
        cll.display();

        cll.removeLast();
        cll.display();
        cll.removeLast();
        cll.display();

        cll.remove(25);
        cll.display();
        cll.remove(40);
        cll.display();
        cll.remove(30);
        cll.display();
    }
}
