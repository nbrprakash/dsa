/**
 * 
 */
package com.learn.dsa.java.queue.fifo;

import java.util.ArrayDeque;
import java.util.Queue;

import com.learn.dsa.java.queue.QueueEmptyException;
import com.learn.dsa.java.queue.QueueOverFlowException;

/**
 * 
 */
public class QueueTest {

	/**
	 * 
	 */
	public QueueTest() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueTest qt = new QueueTest();
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
		MyQueue queue = new MyQueue(5);
		
		try {
			queue.offer(10);
			queue.offer(20);
			
			int element = queue.poll();
			System.out.println("The value is:" + element);
			
			queue.offer(30);
			queue.offer(40);
			queue.offer(50);
			queue.offer(60);
			
			queue.display();
			
			//This will cause exception.
//			queue.offer(70);
			
			element = queue.poll();
			System.out.println("The value is:" + element);
			
			element = queue.poll();
			System.out.println("The value is:" + element);
			
			element = queue.poll();
			System.out.println("The value is:" + element);
			
			element = queue.poll();
			System.out.println("The value is:" + element);
			
			element = queue.poll();
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
