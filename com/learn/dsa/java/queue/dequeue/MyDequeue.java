/**
 * 
 */
package com.learn.dsa.java.queue.dequeue;

import com.learn.dsa.java.queue.QueueEmptyException;
import com.learn.dsa.java.queue.QueueOverFlowException;

/**
 * 
 */
public class MyDequeue {
	
	private int[] array;
	private int head=0;
	private int tail=0;
	private int size=0;

	/**
	 * 
	 */
	public MyDequeue(int capacity) {
		super();
		array = new int[capacity];
	}
	
	public void offer(int e) throws QueueOverFlowException{
		if(size == array.length) {
			throw new QueueOverFlowException("Queue is full.");
		}
		
		this.array[tail] = e;
		tail = ((++tail) % array.length);
		size++;
	}
	
	public int poll() throws QueueEmptyException{
		if(size == 0) {
			throw new QueueEmptyException("Queue is empty.");
		}
		
		int element = array[head];
		head = ((++head) % array.length);
		
		size--;
		
		return element;
	}
	
	public void offerLast(int element) throws QueueOverFlowException{
		offer(element);
	}
	
	public void offerFirst(int element) throws QueueOverFlowException{
		if(size == this.array.length) {
			throw new QueueOverFlowException("Queue is full.");
		}
		
		if(head  == 0) {
			head = array.length-1;
		}else {
			head--;
		}
		
		this.array[head] = element;
		size++;
	}
	
	/**
	 * 
	 * @return int
	 * @throws QueueEmptyException
	 */
	public int pollFirst() throws QueueEmptyException{
		return poll();
	}
	
	/**
	 * 
	 * @return int
	 * @throws QueueEmptyException
	 */
	public int pollLast() throws QueueEmptyException{
		if(size == 0) {
			throw new QueueEmptyException("Queue is empty.");
		}
		
		int loc = tail -1;
		if(loc <0) {
			loc = array.length-1;
		}
		int element = this.array[loc];
		
		tail = loc;
		size--;
		return element;
	}

	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public int peek() {
		return this.array[head];
	}
	
	public int search(int element) {
		
		int loc = this.head;
		for(int i=0; i<size; i++) {
			System.out.println(this.array[loc]);

			if(array[loc] == element){
				System.out.println("Element Found");
				return loc;
			}

			loc = ((++loc) %array.length);
		}
		return -1;
	}

	/**
	 * 
	 */
	public void display() {
		
		int loc = this.head;
		for(int i=0; i<size; i++) {
			System.out.print(" " + this.array[loc]);

			loc = ((++loc) %array.length);
		}
		System.out.println("");
	}

	public int capacity() {
		return this.array.length;
	}
	
	public int size() {
		return this.size;
	}
}
