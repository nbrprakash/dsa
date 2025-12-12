/**
 * 
 */
package com.learn.dsa.java.list.linkedList;

import com.learn.dsa.java.list.ElementUnavailableException;
import com.learn.dsa.java.list.ListEmptyException;

/**
 * 
 */
public class MyLinkedList {
	
	final private Node header;

	/**
	 * 
	 */
	public MyLinkedList() {
		super();
		header = new Node(-1);
	}
	
	/**
	 * 
	 * @param element
	 */
	public void add(int element) {
		this.addLast(element);
	}
	
	/**
	 * 
	 * @param element
	 */
	public void addLast(int element) {
		Node nodePtr = header;
		while(nodePtr.getNextNode() != null) {
			nodePtr = nodePtr.getNextNode();
		}
		
		Node newNode = new Node(element);
		nodePtr.setNextNode(newNode);
	}
	
	/**
	 * 
	 * @param element
	 */
	public void addFirst(int element) {
		
		Node newNode = new Node(element);
		newNode.setNextNode(header.getNextNode());
		header.setNextNode(newNode);
	}
	
	/**
	 * 
	 * @param element
	 * @param referenceValue
	 */
	public void addAfter(int element, int referenceValue) throws ElementUnavailableException{
		
		Node nodePtr = header.getNextNode();
		
		while(nodePtr != null) {
			if(nodePtr.getValue() == referenceValue) {
				Node newNode = new Node(element);
				newNode.setNextNode(nodePtr.getNextNode());
				nodePtr.setNextNode(newNode);
				
				return;
			}
			nodePtr = nodePtr.getNextNode();
		}
		
		throw new ElementUnavailableException("Element: " + referenceValue + " is not available.");
	}
	
	/**
	 * 
	 */
	public void display() {
		Node nodePtr = header.getNextNode();
		while(nodePtr != null) {
			System.out.print(" " + nodePtr.getValue());
			nodePtr = nodePtr.getNextNode();
		}
		System.out.println("");
	}	
	
	/**
	 * 
	 * @return
	 * @throws ListEmptyException
	 */
	public int remove() throws ListEmptyException{
		return removeFirst();
	}
	
	/**
	 * 
	 * @return int
	 * @throws ListEmptyException
	 */
	public int removeFirst() throws ListEmptyException{
	
		Node n = this.header.getNextNode();
		if(n == null) {
			throw new ListEmptyException("List is empty");
		}
		
		this.header.setNextNode(n.getNextNode());
		return n.getValue();
	}
	
	/**
	 * 
	 * @return int
	 * @throws ListEmptyException
	 */
	public int removeLast() throws ListEmptyException{
		Node currentNode = this.header;
		Node nextNode = this.header.getNextNode();
		if(nextNode == null) {
			throw new ListEmptyException("List is empty");
		}
		
		while(nextNode.getNextNode() != null) {
			currentNode = nextNode;
			nextNode = nextNode.getNextNode();
		}
		currentNode.setNextNode(null);
		return nextNode.getValue();
	}
	
	/**
	 * 
	 * @param element
	 * @param referenceValue
	 * @throws ElementUnavailableException
	 */
	public int removeAfter(int referenceValue) throws ElementUnavailableException{
		
		Node nodePtr = header.getNextNode();
		
		while(nodePtr != null) {
			if(nodePtr.getValue() == referenceValue) {
				
				if(nodePtr.getNextNode() == null) {
					throw new ElementUnavailableException("Element after:" + referenceValue + " does not exist.");
				}
				
				int element = nodePtr.getNextNode().getValue();
				nodePtr.setNextNode(nodePtr.getNextNode().getNextNode());
				
				return element;
			}
			nodePtr = nodePtr.getNextNode();
		}
		
		throw new ElementUnavailableException("Element: " + referenceValue + " is not available.");
	}

}
