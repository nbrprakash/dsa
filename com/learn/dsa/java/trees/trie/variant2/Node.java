package com.learn.dsa.java.trees.trie.variant2;

import java.util.HashMap;
import java.util.Map;

public class Node {
    private Map<Character, Node> children;
    private boolean endOfWord = false;

    public Node(){
        endOfWord = false;
        children = new HashMap();
    }

    public Map<Character, Node> getChildren() {
        return children;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}
