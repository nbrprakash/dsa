/**
 * 
 */
package com.learn.dsa.java.set;

/**
 * 
 */
public class SetTest {

	/**
	 * 
	 */
	public SetTest() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SetTest tt = new SetTest();
		tt.testCustomImplementation();

	}
	
	public void testCustomImplementation() {
		MySet set = new MySet();
		set.add("Apple");
		set.add("Ball");
		
		set.display();
		
		set.add("Cat");
		set.display();
		
		set.remove("Doll");
		set.display();
		
		set.remove("Ball");
		set.display();
		
		set.add("Cat");
		set.display();
		
		set.add("cat");
		set.display();
		
	}

}
