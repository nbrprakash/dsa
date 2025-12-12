package com.learn.dsa.java.trees.binarytree;

import java.util.List;

public class MyBinarySearchTree extends MyBinaryTree{

    public MyBinarySearchTree(int element) {
        super(element);
    }

    public void addElement(int element){
        Node temp = this.getRoot();
        Node newNode = new Node(element);

        while(true){
            if(element < temp.getValue()){
                if(temp.getLeftChild() == null){
                    temp.setLeftChild(newNode);
                    break;
                }else{
                    temp = temp.getLeftChild();
                }
            }else{
                if(temp.getRightChild() == null){
                    temp.setRightChild(newNode);
                    break;
                }else{
                    temp = temp.getRightChild();
                }
            }
        }
    }

    public void addElements(List<Integer> list){
        for(Integer ele: list){
            this.addElement(ele);
        }
    }
}
