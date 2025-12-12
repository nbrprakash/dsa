package com.learn.dsa.java.list.doublyLinkedList;

import com.learn.dsa.java.list.linkedList.LinkedListTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DoublyLinkedListTest dllt = new DoublyLinkedListTest();
        dllt.testCollectionsImplementation();
//		dllt.testCustomImplementation();

    }

    public void testCollectionsImplementation(){
        LinkedList<Integer> linkedlist = new LinkedList<>();

        linkedlist.add(5);
        linkedlist.add(10);
        linkedlist.add(15);
        linkedlist.add(20);

        Iterator<Integer> iter = linkedlist.iterator();

        while(iter.hasNext()){
            System.out.print(" " + iter.next());
        }
        System.out.println(" ");

        Iterator<Integer> descIter = linkedlist.descendingIterator();
        while(descIter.hasNext()){
            System.out.print(" " + descIter.next());
        }
        System.out.println(" ");

        ListIterator<Integer> listIterator = linkedlist.listIterator(linkedlist.size());
        while(listIterator.hasPrevious()){
            System.out.print(" " + listIterator.previous());
        }
        System.out.println(" ");

        while(listIterator.hasNext()){
            System.out.print(" " + listIterator.next());
        }
        System.out.println(" ");
    }

    public void testCustomImplementation(){
        MyDoublyLinkedList dll = new MyDoublyLinkedList();
        dll.add(10);
        dll.addFirst(20);
        dll.addLast(30);
        dll.display();

        dll.addAfter(40, 20);
        dll.display();
        dll.addBefore(50,10);
        dll.display();

    }
}
