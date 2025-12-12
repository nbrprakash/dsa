/**
 * 
 */
package com.learn.dsa.java.queue.priorityQueue;

/**
 * 
 */
public class MyPQTest {

	/**
	 * 
	 */
	public MyPQTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyPQTest aa = new MyPQTest();
		
		aa.testCustomImplementation();

	}
	
	/**
	 * 
	 */
	public void testCustomImplementation() {
		MyPriorityQueue pQueue = new MyPriorityQueue();
		
		pQueue.add(10, 30);
		pQueue.add(20, 80);
		
		pQueue.display();
		
		pQueue.add(25, 10);
		pQueue.display();
		
		pQueue.add(5, 90);
		pQueue.display();
		
		pQueue.add(15, 60);
		pQueue.display();
		
		pQueue.add(35, 60);
		pQueue.display();
		
		pQueue.add(45, 60);
		pQueue.display();
		
		pQueue.remove(15);
		pQueue.display();
		
		pQueue.remove(99);
		pQueue.display();
	}

}
