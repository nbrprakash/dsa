package com.learn.dsa.java.trees.threadedbinarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class ThreadedBinaryTreeTest {
    public static void main(String[] args){
        new ThreadedBinaryTreeTest().test();
    }

    public void test(){
        int[] array = {50, 15, 45, 66, 43, 26, 3};

        MyThreadedBinaryTree tree = new MyThreadedBinaryTree(array[0]);

        Node[] nodeArray = new Node[array.length];
        for(int i=1; i<array.length;i++){
            nodeArray[i] = new Node(array[i]);
        }

        tree.getRoot().addLeftChild(nodeArray[1]);
        tree.getRoot().addRightChild(nodeArray[2]);

        for(int i=1;i<((nodeArray.length-1)/2); i++){
            nodeArray[i].addLeftChild(nodeArray[(2*i)+1]);
            nodeArray[i].addRightChild(nodeArray[(2*i)+2]);
        }

        tree.traversal();
    }
}
