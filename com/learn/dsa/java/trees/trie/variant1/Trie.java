package com.learn.dsa.java.trees.trie.variant1;

public class Trie {
    private Node root;
    private int maxDepth;

    public Trie(){
        root = new Node();
        maxDepth = -1;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void insert(String key){
        Node temp = root;
        Node node;
        int index=-1;

        if(key.length() > maxDepth){
            maxDepth = key.length();
        }

        for(char c: key.toCharArray()){
            index = c-'a';
            if(temp.getChildren()[index] == null){
                node = new Node();
                temp.getChildren()[index] = node;
            }
            temp = temp.getChildren()[index];
        }
        temp.setEndOfWord(true);
    }


    public boolean search(String key){
        Node temp = root;
        int index = -1;
        for(char c: key.toCharArray()){
            index = c-'a';

            if(temp.getChildren()[index] == null){
                return false;
            }

            temp = temp.getChildren()[index];
        }
        return temp.isEndOfWord();
    }

    public boolean isPrefix(String key){
        Node temp = root;
        int index = -1;
        for(char c: key.toCharArray()) {
            index = c - 'a';

            if (temp.getChildren()[index] == null) {
                return false;
            }
            temp = temp.getChildren()[index];
        }
        return true;
    }

    public void display(){
        display(root, new StringBuilder());
    }

    private void display(Node node, StringBuilder word){
        if(node.isEndOfWord() == true){
            System.out.println(word);
        }

        char ch;
        for(int i=0; i<26; i++){
            if(node.getChildren()[i] != null){
                ch = (char) (i+ 'a');
                display(node.getChildren()[i], word.append(ch));
                word.deleteCharAt(word.length()-1);
            }
        }
    }
}
