/**
 * 
 */
package com.learn.dsa.java.map;

/**
 * 
 */
public class Node {

	private int hashcode;
	private String key;
	private int value;
	private Node nextNode;
	
	/**
	 * 
	 */
	public Node() {
		super();
	}

	/**
	 * @return the hashcode
	 */
	public int getHashcode() {
		return hashcode;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the nextNode
	 */
	public Node getNextNode() {
		return nextNode;
	}

	/**
	 * @param hashcode the hashcode to set
	 */
	public void setHashcode(int hashcode) {
		this.hashcode = hashcode;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}	
}