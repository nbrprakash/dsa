package com.learn.dsa.java.trees.binarytree;

public class MyBinaryTree {
    private final Node root;

    public MyBinaryTree(int element) {
        this.root = new Node(element);
    }

    public Node getRoot() {
        return root;
    }

}
