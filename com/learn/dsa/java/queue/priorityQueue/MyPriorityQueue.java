/**
 * 
 */
package com.learn.dsa.java.queue.priorityQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 */
public class MyPriorityQueue {
	
	List<Node> list = new LinkedList<>();

	/**
	 * 
	 */
	public MyPriorityQueue() {
		super();
	}
	
	/**
	 * 
	 * @param element
	 * @param priority
	 */
	public void add(int element, int priority) {
		
		boolean nodeAdded = false;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getPriority() < priority) {
				Node node = new Node(element, priority);
				list.add(i, node);
				nodeAdded = true;
				break;
			}
		}
		
		if(nodeAdded == false) {
			Node node = new Node(element, priority);
			list.addLast(node);
		}
		
	}
	
	/**
	 * 
	 */
	public void display() {
		Iterator<Node> iter = list.iterator();
		
		Node node = null;
		System.out.println("Priority:: Value");
		while(iter.hasNext()) {
			node = iter.next();
			System.out.println(node.getPriority() + ":: " + node.getValue());
		}
	}
	
	/**
	 * 
	 * @param element
	 */
	public void remove(int element) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getValue() == element) {
				list.remove(i);
				break;
			}
		}
	}
}