package com.learn.dsa.java.list.circularDoublyLinkedList;

public class MyCircularDoublyLinkedList {
    private Node header;
    private int size;

    public MyCircularDoublyLinkedList(){
        super();
        this.header = new Node(-1);
        this.size=0;
    }

    private void addInitial(int element){
        Node node = new Node(element);
        this.header.setNextNode(node);
        node.setNextNode(node);
        node.setPrevNode(node);
        this.size++;
    }

    public void addNode(int element){

        if(this.size == 0){
            addInitial(element);
            return;
        }

        Node node = new Node(element);
        if(this.size == 1){
            header.getNextNode().setNextNode(node);
            header.getNextNode().setPrevNode(node);

            node.setPrevNode(header.getNextNode());
            node.setNextNode(header.getNextNode());
            this.size++;
            return;
        }

        Node temp = this.header.getNextNode();
        temp = temp.getPrevNode();

        node.setNextNode(temp.getNextNode());
        node.setPrevNode(temp);
        temp.setNextNode(node);

        this.header.getNextNode().setPrevNode(node);
        this.size++;
    }

    public void addLast(int element){
        this.addNode(element);
    }

    public void addFirst(int element){
        if(this.size == 0){
            this.addInitial(element);
            return;
        }

        Node node = new Node(element);
        node.setNextNode(this.header.getNextNode());
        node.setPrevNode(this.header.getNextNode().getPrevNode());

        this.header.getNextNode().getPrevNode().setNextNode(node);
        this.header.getNextNode().setPrevNode(node);
        this.header.setNextNode(node);
    }

    public void remove(int element){
        switch(this.size){
            case 0:
                System.out.println("List empty");
                //throw exception
                break;
            case 1:
                if(this.header.getNextNode().getValue() == element){
                    this.header.setNextNode(null);
                    this.size--;
                }else{
                    System.out.println("Element unavailable");
                    //throw exception
                }
                break;
            default:

                Node temp = header.getNextNode();
                int iCounter =0;
                while(iCounter<this.size){
                    if(temp.getValue() == element){
                        break;
                    }
                    temp = temp.getNextNode();
                    iCounter++;
                }

                if(iCounter == this.size){
                    System.out.println("Element unavailable");
                    //throw exception
                }else{
                    temp = temp.getPrevNode();
                    temp.setNextNode(temp.getNextNode().getNextNode());
                    temp.getNextNode().setPrevNode(temp);
                }
                break;
        }
    }



    public void display(boolean forward){
        if(this.size == 0){
            System.out.println("List is empty.");
            return;
        }
        Node temp = header.getNextNode();

        if(forward == true){
            System.out.print("List in forward order:");
            do{
                System.out.print(" " + temp.getValue());
                temp = temp.getNextNode();
            }while(temp != header.getNextNode());
            System.out.println();
        }else{
            System.out.print("List in reverse order:");
            do{
                System.out.print(" " + temp.getValue());
                temp = temp.getPrevNode();
            }while(temp != header.getNextNode());
            System.out.println();
        }
    }
}
