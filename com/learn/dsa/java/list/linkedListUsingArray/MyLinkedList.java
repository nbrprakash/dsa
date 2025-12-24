package com.learn.dsa.java.list.linkedListUsingArray;

public class MyLinkedList {
    private Node[] nodeArray;
    private int maxSize;
    private int size;
    private int header;
    private boolean[] availableLocations;

    public MyLinkedList(int maxSize){
        this.maxSize = maxSize;
        this.nodeArray = new Node[maxSize];
        this.availableLocations = new boolean[maxSize];
        for(int i=0; i<maxSize; i++){
            availableLocations[i] = true;
        }
        this.header =0;
    }

    public void add(int element){
        Node node = new Node(element);
        if(this.size == 0){
            header = 0;
            this.nodeArray[0] = node;
            availableLocations[0] = false;
            this.size++;
        }else if(this.size == this.maxSize){
            //throw list full exception
        }else{
            int loc = 0;
            while(availableLocations[loc] == false){
                loc++;
            }

            int currentNodeLocation = -1;
            int nextNodeLocation = header;
            for(int i=0; i<this.size; i++){
                currentNodeLocation = nextNodeLocation;
                nextNodeLocation = this.nodeArray[currentNodeLocation].getNextNodeLocation();
            }
            this.nodeArray[currentNodeLocation].setNextNodeLocation(loc);
            this.nodeArray[loc] = node;
            this.availableLocations[loc] = false;
            this.size++;
        }
    }

    public void addFirst(int element){
        if(this.size == 0){
            this.add(element);
            return;
        }else if(this.size == this.maxSize){
            //throw list full exception
        }else{
            int loc = 0;
            while(availableLocations[loc] == false){
                loc++;
            }

            Node node = new Node(element);
            node.setNextNodeLocation(header);
            this.nodeArray[loc] = node;
            header = loc;
            availableLocations[loc] = false;
            this.size++;
        }
    }

    public void addLast(int element){
            this.add(element);
    }

    public void remove(int element){
        if(this.size == 0){
            //throw exception.
        }else if(this.size == 1) {
            if(this.nodeArray[header].getValue() == element){
                removeFirst();
            }else{
                //throw exception.
            }
        }else{

            if(this.nodeArray[header].getValue() == element){
                removeFirst();
            }else {
                boolean elementFound = false;
                Node temp = this.nodeArray[header];
                int prevLoc = -1;
                int nextLoc = -1;
                int currLoc = header;

                for (int i = 0; i < this.size; i++) {
                    if (temp.getValue() == element) {
                        elementFound = true;
                        break;
                    }
                    prevLoc = currLoc;
                    currLoc = temp.getNextNodeLocation();
                    temp = this.nodeArray[currLoc];
                }

                if (elementFound == false) {
                    //throw exception
                }

                this.nodeArray[prevLoc].setNextNodeLocation(this.nodeArray[currLoc].getNextNodeLocation());
                this.availableLocations[currLoc] = true;
                this.size--;
            }
        }

    }

    public void removeFirst(){
        this.size--;
        this.availableLocations[header] = true;

        if(this.size == 0){
            this.header =-1;
        }else{
            this.header = this.nodeArray[header].getNextNodeLocation();
        }



    }

    public void display() {

        if(this.size == 0){
            System.out.println("List is empty.");
            return;
        }

        int temp = header;
        Node tempNode;
        System.out.print("List:");
        for(int i=0; i<this.size; i++){
            tempNode = this.nodeArray[temp];
            System.out.print(" " + tempNode.getValue());
            temp = tempNode.getNextNodeLocation();
        }

        System.out.println("");
    }


}
