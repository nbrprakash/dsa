package com.learn.dsa.java.trees.threadedbinarytree;

public class MyThreadedBinaryTree {
    private Node root;

    public MyThreadedBinaryTree(int element){
        this.root = new Node(element);
    }

    public Node getRoot() {
        return root;
    }

    public void traversal(){
        Node temp = this.root;
        if(temp == null){
            //throw exception
        }

        boolean threadTravel = false;
        while(temp != null){
            if((temp.getLeftChild() != null) && (threadTravel == false)){
                temp = temp.getLeftChild();
            }else{
                System.out.print(" " + temp.getValue());
                threadTravel = temp.isThread();

                temp = temp.getRightChild();

//                if(threadTravel == true) {
//
//                    threadTravel = false;
//                }
//
//                System.out.println(" " + temp.getValue());
//                    if(temp.getRightChild() != null){
//                        temp = temp.getRightChild();
//                    }
//                }
            }

        }
    }



}
