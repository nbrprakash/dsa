/**
 * 
 */
package com.learn.dsa.java.list.linkedListUsingArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class LinkedListTest {

	/**
	 * 
	 */
	public LinkedListTest() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedListTest llt = new LinkedListTest();
//		llt.testCollectionsImplementation();
		llt.testCustomImplementation();

	}
	
	/**
	 * 
	 */
	private void testCustomImplementation(){
		MyLinkedList ll = new MyLinkedList(10);
		ll.display();
		ll.add(20);
		ll.add(30);
		ll.addFirst(10);
		ll.add(50);
		ll.display();

		ll.remove(20);
		ll.display();

		ll.remove(50);
		ll.display();

		ll.remove(10);
		ll.display();

		ll.remove(30);
		ll.display();

		ll.add(70);
		ll.display();
	}
	
	/**
	 * 
	 */
	private void testCollectionsImplementation() {
		
		List<Integer> list = new ArrayList();
		
		list.add(20);
		list.add(40);
		list.addFirst(10);
		list.add(2, 30);
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.print(" " + iter.next());
		}
		System.out.println(" ");
		
		//This will result in error
		// list.remove(20);
		
		list.remove(Integer.valueOf(20));
		
		iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.print(" " + iter.next());
		}
		System.out.println(" ");
	}

}