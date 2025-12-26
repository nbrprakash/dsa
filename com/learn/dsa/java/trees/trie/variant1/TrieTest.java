package com.learn.dsa.java.trees.trie.variant1;

public class TrieTest {

    public static void main (String[] args){
        Trie trie = new Trie();

        String[] array = {"and", "ant", "do", "dad"};

        for(String s: array){
            trie.insert(s);
        }

        if(trie.search("and") == true){
            System.out.println("The key is present.");
        }else{
            System.out.println("The key is not present.");
        }

        if(trie.search("are") == true){
            System.out.println("The key is present.");
        }else{
            System.out.println("The key is not present.");
        }

        if(trie.isPrefix("are") == true){
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
