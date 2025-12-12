package com.learn.dsa.java.queue.priorityQueue;

class Node {
	private int value;
	private int priority;

	public Node(int element, int priority) {
		super();
		this.value = element;
		this.priority = priority;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	
}
