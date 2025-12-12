package com.learn.dsa.java.trees.binarytree;

import com.learn.dsa.java.trees.threadedbinarytree.MyThreadedBinaryTree;

import java.util.List;

public class BinaryTreeTest {
    public static void main(String[] args){

//        new BinaryTreeTest().binaryTree();
//        new BinaryTreeTest().binarySearchTree();
        new BinaryTreeTest().test();
    }

    public void binaryTree(){
        MyBinaryTree myTree = new MyBinaryTree(30);
        myTree.getRoot().setLeftChild(new Node(15));
        myTree.getRoot().setRightChild(new Node(45));
        myTree.getRoot().getLeftChild().setLeftChild(new Node(66));
        myTree.getRoot().getLeftChild().setRightChild(new Node(43));
        myTree.getRoot().getRightChild().setLeftChild(new Node(26));
        myTree.getRoot().getRightChild().setRightChild(new Node(3));

        MyBinaryTreeTraversal btt = new MyBinaryTreeTraversal();
        btt.traversal(myTree, MyBinaryTreeTraversal.TRAVERSAL_TYPE.PREORDER);
        btt.traversal(myTree, MyBinaryTreeTraversal.TRAVERSAL_TYPE.INORDER);
        btt.traversal(myTree, MyBinaryTreeTraversal.TRAVERSAL_TYPE.POSTORDER);
    }

    public void binarySearchTree(){
        MyBinarySearchTree myTree = new MyBinarySearchTree(30);
        myTree.addElements(List.of(10, 50, 86, 97, 7, 44, 54, 98, 0, 26));

        MyBinaryTreeTraversal btt = new MyBinaryTreeTraversal();
        btt.traversal(myTree, MyBinaryTreeTraversal.TRAVERSAL_TYPE.INORDER);
    }

    public void test(){
        int[] array = {50, 15, 45, 66, 43, 26, 3};

        MyBinaryTree tree = new MyBinaryTree(array[0]);

        Node[] nodeArray = new Node[array.length];
        for(int i=1; i<array.length;i++){
            nodeArray[i] = new Node(array[i]);
        }

        tree.getRoot().setLeftChild(nodeArray[1]);
        tree.getRoot().setRightChild(nodeArray[2]);

        for(int i=1;i<((nodeArray.length-1)/2); i++){
            nodeArray[i].setLeftChild(nodeArray[(2*i)+1]);
            nodeArray[i].setRightChild(nodeArray[(2*i)+2]);
        }

        MyBinaryTreeTraversal btt = new MyBinaryTreeTraversal();
        btt.traversal(tree, MyBinaryTreeTraversal.TRAVERSAL_TYPE.PREORDER);
        btt.traversal(tree, MyBinaryTreeTraversal.TRAVERSAL_TYPE.INORDER);
        btt.traversal(tree, MyBinaryTreeTraversal.TRAVERSAL_TYPE.POSTORDER);
        btt.traversal(tree, MyBinaryTreeTraversal.TRAVERSAL_TYPE.LEVELORDER);
    }
}
