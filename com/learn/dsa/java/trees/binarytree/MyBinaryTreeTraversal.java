package com.learn.dsa.java.trees.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyBinaryTreeTraversal {

    public enum TRAVERSAL_TYPE {PREORDER, INORDER, POSTORDER, LEVELORDER};

    public void traversal(MyBinaryTree binaryTree, TRAVERSAL_TYPE tt){
        switch(tt){
            case PREORDER -> {
                System.out.print("PreOrder Traversal ->");
                preOrderTraversal(binaryTree.getRoot());
                System.out.println(" ");
            }
            case INORDER -> {
                System.out.print("InOrder Traversal ->");
                inOrderTraversal(binaryTree.getRoot());
                System.out.println(" ");
            }
            case POSTORDER -> {
                System.out.print("PostOrder Traversal ->");
                postOrderTraversal(binaryTree.getRoot());
                System.out.println(" ");
            }
            case LEVELORDER -> {
                System.out.print("levelOrder Traversal ->");
                levelOrderTraversal(binaryTree.getRoot());
                System.out.println(" ");
            }
        }
    }

    public void preOrderTraversal(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.getValue() + " ");
        preOrderTraversal(node.getLeftChild());
        preOrderTraversal(node.getRightChild());
    }

    public void inOrderTraversal(Node node){
        if(node == null){
            return;
        }

        inOrderTraversal(node.getLeftChild());
        System.out.print(node.getValue() + " ");
        inOrderTraversal(node.getRightChild());
    }

    public void postOrderTraversal(Node node){
        if(node == null){
            return;
        }

        postOrderTraversal(node.getLeftChild());
        postOrderTraversal(node.getRightChild());
        System.out.print(node.getValue() + " ");
    }

    public void levelOrderTraversal(Node node){
        if(node == null){
            //throw error
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);

        while(queue.size()!= 0){
            node = queue.poll();

            System.out.print(node.getValue() + " ");

            if(node.getLeftChild() != null) {
                queue.offer(node.getLeftChild());
            }

            if(node.getRightChild() != null) {
                queue.offer(node.getRightChild());
            }
        }
    }
}
