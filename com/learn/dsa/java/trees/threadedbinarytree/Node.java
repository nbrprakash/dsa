package com.learn.dsa.java.trees.threadedbinarytree;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;
    private boolean thread;

    public Node(int element){
        this.value = element;
    }

    public int getValue() {
        return value;
    }

//    public void setValue(int value) {
//        this.value = value;
//    }

    public Node getLeftChild() {
        return leftChild;
    }

//    public void setLeftChild(Node leftChild) {
//        this.leftChild = leftChild;
//    }

    public Node getRightChild() {
        return rightChild;
    }

//    public void setRightChild(Node rightChild) {
//        this.rightChild = rightChild;
//    }

    public boolean isThread() {
        return thread;
    }

//    public void setThread(boolean thread) {
//        this.thread = thread;
//    }

    public void addLeftChild(Node newNode){
        newNode.thread = true;
        newNode.rightChild = this;

        this.leftChild = newNode;
    }

    public void addRightChild(Node newNode){
        newNode.rightChild = this.rightChild;
        newNode.thread = this.thread;

        this.rightChild = newNode;
        this.thread = false;
    }
}
