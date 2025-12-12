package com.learn.dsa.java.list.doublyLinkedList;

public class MyDoublyLinkedList {

    final private Node header;

    public MyDoublyLinkedList() {
        super();
        header = new Node(-1);
    }

    public void add(int element){
        addFirst(element);
    }

    public void addFirst(int element){
        Node node = new Node(element);
        if(header.getNextPtr() != null){
            node.setNextPtr(header.getNextPtr());
            header.getNextPtr().setPrevPtr(node);
        }

        node.setPrevPtr(header);
        header.setNextPtr(node);
    }

    public void addLast(int element){
        Node node = new Node(element);

        Node temp = header;

        while(temp.getNextPtr() != null){
            temp = temp.getNextPtr();
        }

        temp.setNextPtr(node);
        node.setPrevPtr(temp);
    }

    public void addAfter(int element, int reference){
        Node node = new Node(element);

        Node temp = header;
        boolean found = false;
        while(temp.getNextPtr() != null){
            temp = temp.getNextPtr();
            if(temp.getValue() == reference){
                found = true;
                break;
            }
        }

        if(found == true) {
            if(temp.getNextPtr() != null) {
                node.setNextPtr(temp.getNextPtr());
                temp.getNextPtr().setPrevPtr(node);
            }
            node.setPrevPtr(temp);
            temp.setNextPtr(node);
        }else{
            //throw exception
        }

    }

    public void addBefore(int element, int reference) {

        Node node = new Node(element);

        Node temp = header;
        boolean found = false;
        while(temp.getNextPtr() != null){
            temp = temp.getNextPtr();
            if(temp.getValue() == reference){
                found = true;
                break;
            }
        }

        if(found == true) {
            temp.getPrevPtr().setNextPtr(node);
            node.setPrevPtr(temp.getPrevPtr());
            node.setNextPtr(temp);
            temp.setPrevPtr(node);
        }else{
            //throw exception
        }

    }

    public void display(){
        Node nodePtr = header.getNextPtr();
        while(nodePtr!= null){
            System.out.print(" " + nodePtr.getValue());
            nodePtr = nodePtr.getNextPtr();
        }
        System.out.println("");
    }

    public void remove(int element){
        Node temp = header;
        boolean found = false;

        while(temp.getNextPtr() != null){
            if(temp.getNextPtr().getValue() == element){
                found = true;
                break;
            }
            temp = temp.getNextPtr();
        }

        if(found == true) {
            temp.setNextPtr(temp.getNextPtr().getNextPtr());
            temp.getNextPtr().setPrevPtr(temp);

        }else{
            //throw exception
        }
    }


}
