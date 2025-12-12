/**
 * 
 */
package com.learn.dsa.java.list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.learn.dsa.java.list.ElementUnavailableException;
import com.learn.dsa.java.list.ListEmptyException;

/**
 * 
 */
public class LinkedListTest {

	/**
	 * 
	 */
	public LinkedListTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListTest llt = new LinkedListTest();
		llt.testCollectionsImplementation();
//		llt.testCustomImplementation();

	}
	
	/**
	 * 
	 */
	private void testCustomImplementation(){
		MyLinkedList ll = new MyLinkedList();
		ll.add(20);
		ll.add(30);
		ll.addFirst(10);
		ll.add(50);
		try {
			ll.addAfter(40, 30);
		}catch(ElementUnavailableException e) {
			System.out.println("Caught Exception:" + e);
			e.printStackTrace();
		}
		ll.display();
		
		try {
			int element = ll.remove();
			System.out.println("The value is:" + element);
			ll.display();
			
			element = ll.removeLast();
			System.out.println("The value is:" + element);
			
			ll.display();
			
			element = ll.removeAfter(20);
			System.out.println("The value is:" + element);
			
			ll.display();
		} catch (ListEmptyException | ElementUnavailableException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 */
	private void testCollectionsImplementation() {
		
		List<Integer> list = new LinkedList<>();
		
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
