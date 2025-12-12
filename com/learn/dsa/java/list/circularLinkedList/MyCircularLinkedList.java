package com.learn.dsa.java.list.circularLinkedList;


public class MyCircularLinkedList {

    final private Node header;
    private int size;

    public MyCircularLinkedList() {
        super();
        header = new Node(-1);
        size =0;
    }

    private void addInitial(int element){
        if(this.size != 0) {
            //throw exception;
        }

        Node newNode = new Node(element);
        header.setNextNode(newNode);
        newNode.setNextNode(newNode);
        this.size++;
    }

    public void display(){
        Node temp = header;
        System.out.print("List Values -> ");
        if(this.size != 0) {
            for (int iCounter = 0; iCounter < (this.size + 1); iCounter++) {
                temp = temp.getNextNode();
                System.out.print(temp.getValue() + " ");
            }
        }
        System.out.println("...");
    }

    /**
     *
     * @param element
     */
    public void addLast(int element) {
        if(this.size == 0) {
            this.addInitial(element);
        }

        Node newNode = new Node(element);
        newNode.setNextNode(header.getNextNode());

        Node temp = header;
        for(int i=0; i<this.size; i++){
            temp = temp.getNextNode();
        }
        temp.setNextNode(newNode);
        this.size++;

    }

    /**
     *
     * @param element
     */
    public void addFirst(int element) {

        if(this.size == 0) {
            this.addInitial(element);
            return;
        }

        Node newNode = new Node(element);
        newNode.setNextNode(header.getNextNode());
        header.setNextNode(newNode);

        Node temp = newNode;
        for(int i=0; i<this.size; i++){
            temp = temp.getNextNode();
        }
        temp.setNextNode(newNode);

        this.size++;
    }

    public void addAfter(int element, int referenceValue){
        Node temp = this.header;
        boolean found = false;
        for(int i=0; i<this.size; i++){
            temp = temp.getNextNode();
            if(temp.getValue() == referenceValue){
                found = true;
                break;
            }
        }
        if(found == true){
            Node newNode = new Node(element);
            newNode.setNextNode(temp.getNextNode());
            temp.setNextNode(newNode);
            this.size++;
        }else{
            //throw reference not found error
        }
    }

    public void addBefore(int element, int referenceValue){
        if(this.size <1){
            //throw exception
        }

        if(header.getNextNode().getValue() == referenceValue){
            addFirst(element);
            return;
        }

        Node temp = this.header;
        Node trailing = null;
        boolean found = false;
        for(int i=0; i<this.size; i++){
            trailing = temp;
            temp = temp.getNextNode();
            if(temp.getValue() == referenceValue){
                found = true;
                break;
            }
        }
        if(found == true){
            Node newNode = new Node(element);
            newNode.setNextNode(temp);
            trailing.setNextNode(newNode);
            this.size++;
        }else{
            //throw reference not found error
        }
    }

    public void remove(int element){
        if(this.size == 0){
            //throw error
        }else if(this.size == 1){
           if(header.getNextNode().getValue() != element){
               //throw error
           }else{
               header.setNextNode(null);
               this.size =0;
               return;
           }
        }

        if(header.getNextNode().getValue() == element){
            this.removeFirst();
            return;
        }

        Node temp = header;
        Node trailer = null;
        boolean found = false;
        for(int i=0; i<this.size; i++){
            trailer = temp;
            temp = temp.getNextNode();
            if(temp.getValue() == element){
                found = true;
                break;
            }
        }

        if(found == false){
            //throw error
        }

        trailer.setNextNode(temp.getNextNode());
        this.size--;
    }

    public void removeFirst(){
        if(this.size == 0){
            //throw error
        }else if(this.size == 1){
            header.setNextNode(null);
            this.size =0;
            return;
        }
        Node temp = header;
        for(int i=0; i<this.size; i++){
            temp = temp.getNextNode();
        }
        temp.setNextNode(temp.getNextNode().getNextNode());
        header.setNextNode(header.getNextNode().getNextNode());
        this.size--;
    }

    public void removeLast(){
        if(this.size == 0){
            //throw error
        }else if(this.size == 1){
            header.setNextNode(null);
            this.size =0;
            return;
        }

        Node temp = header;
        for(int i=0; i<this.size-1; i++){
            temp = temp.getNextNode();
        }
        temp.setNextNode(header.getNextNode());
        this.size--;
    }
}
