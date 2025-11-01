/**
 * 
 */
package com.learn.dsa.java.stack;

/**
 * 
 */
public class MyStack {
	
	private int[] array;
	private int size;

	/**
	 * 
	 */
	public MyStack(int capacity) {
		super();
		
		this.array = new int[capacity];
	}
	
	public void push(int element) throws StackOverFlowException{
		if(array.length == size) {
			throw new StackOverFlowException("Stack is full. Can't accommodate " + element);
		}
		this.array[size++] = element;
	}
	
	public int pop() throws StackEmptyException{
		
		if(size == 0) {
			throw new StackEmptyException("Stack is empty. Can't pop");
		}
		return this.array[--size];
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public int peek() {
		return this.array[this.size-1];
	}
	
	public int search(int element) {
		for(int i=this.size; i>0; i--) {
			if(this.array[i-1] == element){
				return i;
			}
		}
		return -1;
	}
	
	public int capacity() {
		return this.array.length;
	}
	
	public int size() {
		return this.size;
	}

}
