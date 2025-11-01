/**
 * 
 */
package com.learn.dsa.java.stack;

import java.util.Stack;

/**
 * 
 */
public class StackTest {

	/**
	 * 
	 */
	public StackTest() {
		super();
	}

	public static void main(String[] args) {
		StackTest st = new StackTest();
//		st.testCustomImplementation();
		st.testCollectionsImplementation();
	}

	/**
	 * 
	 */
	public void testCustomImplementation() {

		MyStack stack = new MyStack(5);

		// Check whether stack is empty or not.
		boolean stackEmptyFlag = stack.isEmpty();
		System.out.println("The status of stack empty check is:" + stackEmptyFlag);

		try {
			// Push Elements into the stack.
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
		} catch (StackOverFlowException e) {
			System.out.println("Caught overflow exception:" + e);
		}

		// Check whether stack is empty or not.
		stackEmptyFlag = stack.isEmpty();
		System.out.println("The status of stack empty check is:" + stackEmptyFlag);

		// Inspect the current capacity of the stack
		int stackCapacity = stack.capacity();
		System.out.println("The capacity of the stack is:" + stackCapacity);

		// Inspect the current size of the stack
		int stackSize = stack.size();
		System.out.println("The size of the stack is:" + stackSize);

		try {
			// Push Elements into the stack.
			stack.push(60);
		} catch (StackOverFlowException e) {
			System.out.println("Caught overflow exception:" + e);
		}

		// Inspect top element of the stack.
		int topElement = stack.peek();
		System.out.println("The top element of stack is:" + topElement);

		// Remove top element from stack
		try {
			int removedElement = stack.pop();
			System.out.println("The element removed from stack is:" + removedElement);
		} catch (StackEmptyException e) {
			System.out.println("Caught underflow exception:" + e);
		}
		

		// Inspect top element of the stack.
		topElement = stack.peek();
		System.out.println("The top element of stack is:" + topElement);

		// Remove top element from stack
		try {
			int removedElement = stack.pop();
			System.out.println("The element removed from stack is:" + removedElement);
		} catch (StackEmptyException e) {
			System.out.println("Caught underflow exception:" + e);
		}
		
		// Search for existing element
		int searchResult = stack.search(10);
		System.out.println("The result of search is:" + searchResult);
		
		// Search for top element
		searchResult = stack.search(stack.peek());
		System.out.println("The result of top element search is:" + searchResult);

		// Search for non-existing element
		searchResult = stack.search(40);
		System.out.println("The result of non-existent search is:" + searchResult);
		
		// Add an existing element to stack.
		try {
			// Push Elements into the stack.
			stack.push(20);
		} catch (StackOverFlowException e) {
			System.out.println("Caught overflow exception:" + e);
		}

		// Search for an element existing twice.
		searchResult = stack.search(20);
		System.out.println("The result of search for element existing twice is:" + searchResult);

		// Empty all the elements from the stack.
		while (stack.isEmpty() == false) {
			System.out.println("Emptying the stack....");
			try {
				int removedElement = stack.pop();
				System.out.println("The element removed from stack is:" + removedElement);
			} catch (StackEmptyException e) {
				System.out.println("Caught underflow exception:" + e);
			}
		}
		System.out.println("All the elements popped.");

		// Inspect the current size of the stack
		stackSize = stack.size();
		System.out.println("The size of the stack is:" + stackSize);
		
		// Remove element from empty stack
		try {
			int removedElement = stack.pop();
			System.out.println("The element removed from stack is:" + removedElement);
		} catch (StackEmptyException e) {
			System.out.println("Caught underflow exception:" + e);
		}

	}

	public void testCollectionsImplementation() {
		Stack<Integer> stack = new Stack<Integer>();

		// Check whether stack is empty or not.
		boolean stackEmptyFlag = stack.empty();
		System.out.println("The status of stack empty check is:" + stackEmptyFlag);

		// Push Elements into the stack.
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		// Check whether stack is empty or not.
		stackEmptyFlag = stack.empty();
		System.out.println("The status of stack empty check is:" + stackEmptyFlag);

		// Inspect top element of the stack.
		int topElement = stack.peek();
		System.out.println("The top element of stack is:" + topElement);

		// Remove top element from stack
		int removedElement = stack.pop();
		System.out.println("The element removed from stack is:" + removedElement);

		// Inspect top element of the stack.
		topElement = stack.peek();
		System.out.println("The top element of stack is:" + topElement);

		// Remove top element from stack
		removedElement = stack.pop();
		System.out.println("The element removed from stack is:" + removedElement);

		// Search for existing element
		int searchResult = stack.search(10);
		System.out.println("The result of search is:" + searchResult);

		// Search for top element
		searchResult = stack.search(stack.peek());
		System.out.println("The result of top element search is:" + searchResult);

		// Search for non-existing element
		searchResult = stack.search(40);
		System.out.println("The result of non-existent search is:" + searchResult);

		// Inspect the current capacity of the stack
		int stackCapacity = stack.capacity();
		System.out.println("The capacity of the stack is:" + stackCapacity);

		// Inspect the current size of the stack
		int stackSize = stack.size();
		System.out.println("The size of the stack is:" + stackSize);

		testCollectionsImplementationAdvanced(stack);

	}

	/**
	 * 
	 * @param stack
	 */
	private void testCollectionsImplementationAdvanced(Stack<Integer> stack) {

		// Add an existing element to stack.
		stack.push(20);

		// Search for an element existing twice.
		int searchResult = stack.search(20);
		System.out.println("The result of search for element existing twice is:" + searchResult);

		// Empty all the elements from the stack.
		while (stack.empty() == false) {
			stack.pop();
		}
		System.out.println("All the elements popped.");

		// Inspect the current size of the stack
		int stackSize = stack.size();
		System.out.println("The size of the stack is:" + stackSize);

		// Remove element when stack is empty.
		// This will result in REmptyStackException.
//		int poppedElement = stack.pop();
//		System.out.println("The popped element from empty stack is:" + poppedElement);
	}
}
