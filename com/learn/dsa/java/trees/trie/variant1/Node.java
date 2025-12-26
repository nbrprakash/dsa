package com.learn.dsa.java.trees.trie.variant1;

public class Node {
    private Node[] children;
    private boolean endOfWord;

    public Node(){
        endOfWord = false;
        children = new Node[26];
    }

    public Node[] getChildren() {
        return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}
