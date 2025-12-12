/**
 * 
 */
package com.learn.dsa.java.map.hashtable;

import com.learn.dsa.java.map.Node;

/**
 * 
 */
public class MyHashTable {
	
	private final Node[] array;

	/**
	 * 
	 */
	public MyHashTable() {
		super();
		this.array = new Node[10];
	}
	
	private int hashCodeCalculator(String key) {
		if((key!= null) && (key.length()>0)) {
			return (Character.toTitleCase(key.charAt(0))-'A')/3;
		}
		
		return -1;
	}
	
	
	public void put(String key, int value) {
		
		int bucket = hashCodeCalculator(key);
		Node node = new Node();
		node.setHashcode(bucket);
		node.setKey(key);
		node.setValue(value);
		
		if(array[bucket] == null) {
			array[bucket] = node;
		}else {
			Node temp = array[bucket];
			Node prev = temp;
			while(temp != null) {
				if(key.equals(temp.getKey())) {
					//Replace the value as key already present.
					node.setNextNode(temp.getNextNode());
					prev.setNextNode(node);
					return;
				}
				prev = temp;
				temp = temp.getNextNode();
			}
			prev.setNextNode(node);
		}
	}
	
	public int get(String key) {
		int bucket = hashCodeCalculator(key);
		
		if(array[bucket] == null) {
			return -1;
		}else {
			Node temp = array[bucket];
			while(temp.getNextNode() != null) {
				if(key.equals(temp.getKey())) {
					//Key found
					return temp.getValue();
				}
				temp = temp.getNextNode();
			}
			return -1;
		}
	}
	
	public int remove(String key) {
		int bucket = hashCodeCalculator(key);
		
		if(array[bucket] == null) {
			return -1;
		}else {
			Node temp = array[bucket];
			Node prev = temp;
			
			while(temp != null) {
				if(key.equals(temp.getKey())) {
					//key found
					prev.setNextNode(temp.getNextNode());
					return temp.getValue();
				}
				prev = temp;
				temp = temp.getNextNode();
			}
			
			
			while(temp.getNextNode() != null) {
				if(key.equals(temp.getKey())) {
					//Key found
					return temp.getValue();
				}
				temp = temp.getNextNode();
			}
			return -1;
		}
	}
	
	public void display() {
		System.out.println("===============================");
		Node temp = null;
		for(int i=0; i<array.length; i++) {
			if(array[i] != null) {
				System.out.println("Parsing Bucket:" + i);
				temp = array[i];
				while(temp != null) {
					System.out.println("Key:" + temp.getKey() + "Value:" + temp.getValue());
					temp = temp.getNextNode();
				}
				System.out.println("------");
			}
		}
	}
	
}