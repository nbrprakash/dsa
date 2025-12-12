/**
 * 
 */
package com.learn.dsa.java.queue.dequeue;

import java.util.ArrayDeque;
import java.util.Queue;

import com.learn.dsa.java.queue.QueueEmptyException;
import com.learn.dsa.java.queue.QueueOverFlowException;

/**
 * 
 */
public class MyDequeueTest {

	/**
	 * 
	 */
	public MyDequeueTest() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDequeueTest qt = new MyDequeueTest();
//		qt.testCollectionsImplementation();
		qt.testCustomImplementation();

	}
	
	/**
	 * 
	 */
	public void testCollectionsImplementation() {
		
		ArrayDeque<Integer> queue = new ArrayDeque<>(10);
		queue.offer(10);
		
		int element = queue.poll();
		System.out.println("The value is:" + element);
		
		queue.offerFirst(20);
		
		queue.offerLast(30);
		
		element = queue.pollFirst();
		System.out.println("The value is:" + element);
		
		element = queue.pollLast();
		System.out.println("The value is:" + element);
		
		int size = queue.size();
		System.out.println("The value is:" + size);
		
		element = queue.peekFirst();
		System.out.println("The value is:" + element);
		
		element = queue.peekLast();		
		System.out.println("The value is:" + element);
		
	}
	
	/**
	 * 
	 */
	public void testCustomImplementation() {
		MyDequeue queue = new MyDequeue(5);
		
		try {
			queue.offerFirst(10);
			queue.offerFirst(20);
			
			int element = queue.pollLast();
			System.out.println("The value is:" + element);
			
			queue.offerFirst(30);
			queue.offerFirst(40);
			queue.offerFirst(50);
			queue.offerFirst(60);
			
			queue.display();
			
			//This will cause exception.
//			queue.offer(70);
			
			element = queue.pollLast();
			System.out.println("The value is:" + element);
			
			element = queue.pollLast();
			System.out.println("The value is:" + element);
			
			element = queue.pollLast();
			System.out.println("The value is:" + element);
			
			element = queue.pollLast();
			System.out.println("The value is:" + element);
			
			element = queue.pollLast();
			System.out.println("The value is:" + element);
			
			//This will cause exception.
//			queue.poll();
		} catch (QueueOverFlowException | QueueEmptyException e) {
			// TODO Auto-generated catch block
			System.out.println("Caught Exception:" + e);
//			e.printStackTrace();
		}

		
		
		
	}

}
