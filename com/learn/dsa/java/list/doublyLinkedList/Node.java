package com.learn.dsa.java.list.doublyLinkedList;

public class Node {

    private int value;
    private Node nextPtr;
    private Node prevPtr;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextPtr() {
        return nextPtr;
    }

    public void setNextPtr(Node nextPtr) {
        this.nextPtr = nextPtr;
    }

    public Node getPrevPtr() {
        return prevPtr;
    }

    public void setPrevPtr(Node prevPtr) {
        this.prevPtr = prevPtr;
    }
}
