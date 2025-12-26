package com.learn.dsa.java.trees.trie.variant2;


public class TrieTest {

    public static void main (String[] args){
        Trie trie = new Trie();

        String[] array = {"apple", "app", "banana", "band", "apply"};

        for(String s: array){
            trie.insert(s);
        }

        if(trie.search("app") == true){
            System.out.println("The key is present.");
        }else{
            System.out.println("The key is not present.");
        }

        if(trie.search("are") == true){
            System.out.println("The key is present.");
        }else{
            System.out.println("The key is not present.");
        }

        if(trie.isPrefix("banana") == true){
            System.out.println("The prefix is present.");
        }else{
            System.out.println("The prefix is not present.");
        }

        if(trie.isPrefix("an") == true){
            System.out.println("The prefix is present.");
        }else{
            System.out.println("The prefix is not present.");
        }

        trie.display();

    }
}
