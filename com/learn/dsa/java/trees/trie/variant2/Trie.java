package com.learn.dsa.java.trees.trie.variant2;

import java.util.Map;

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

        if(key.length() > maxDepth){
            maxDepth = key.length();
        }

        Node temp = root;
        int index = -1;

        for(char ch: key.toCharArray()){
            temp = temp.getChildren().computeIfAbsent(ch, c -> new Node());
        }
        temp.setEndOfWord(true);
    }


    public boolean search(String key){
        Node temp = root;

        for(char ch: key.toCharArray()) {
            temp = temp.getChildren().get(ch);
            if(temp == null){
                return false;
            }
        }
        return temp.isEndOfWord();
    }

    public boolean isPrefix(String key){
        Node temp = root;

        for(char ch: key.toCharArray()) {
            temp = temp.getChildren().get(ch);
            if(temp == null){
                return false;
            }
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

        for (Map.Entry<Character, Node> entry : node.getChildren().entrySet()) {
            char character = entry.getKey();
            Node childNode = entry.getValue();

            // Append the current character to the StringBuilder
            word.append(character);

            // Recurse down the trie
            display(childNode, word);

            // Backtrack: remove the last character when returning from recursion
            word.deleteCharAt(word.length() - 1);
        }
    }
}
