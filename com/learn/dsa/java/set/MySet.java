/**
 * 
 */
package com.learn.dsa.java.set;

/**
 * 
 */
public class MySet {
	
	private String[] array;
	private int size;

	/**
	 * 
	 */
	public MySet() {
		super();
		this.array = new String[10]; 
	}
	
	public void add(String str) {
		for(int i=0; i<size; i++) {
			if(array[i].equals(str))
			{
				//duplicate value.
				return;
			}
		}
		array[size] = str;
		size++;
	}
	
	
	public int isPresent(String str) {
		for(int i=0; i<size;i++) {
			if(str.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(String str) {
		int loc = isPresent(str);
		
		if(loc<0) {
			//element not present.
			return;
		}
		
		for(int i=loc; i<size; i++) {
			array[i] = array[i+1];
		}
		size--;
	}
	
	public void display() {
		
		for(int i=0; i<size; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println("");
	}

}
