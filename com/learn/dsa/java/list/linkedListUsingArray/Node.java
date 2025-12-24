package com.learn.dsa.java.list.linkedListUsingArray;

class Node {

	private int value;
	private int nextNodeLocation;
	
	public Node(int value) {
		super();
		this.value = value;
		this.nextNodeLocation = -1;
	}


	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	public int getNextNodeLocation() {
		return nextNodeLocation;
	}

	public void setNextNodeLocation(int nextNodeLocation) {
		this.nextNodeLocation = nextNodeLocation;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}