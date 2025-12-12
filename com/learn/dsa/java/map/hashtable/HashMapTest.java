/**
 * 
 */
package com.learn.dsa.java.map.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 
 */
public class HashMapTest {

	/**
	 * 
	 */
	public HashMapTest() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMapTest tt = new HashMapTest();
		tt.testCustomImplementation();
		tt.testCollectionsImplementation();
	}

	
	public void testCustomImplementation() {
		
		MyHashTable hashmap = new MyHashTable();
		
		hashmap.put("Apple", 10);
		hashmap.put("Ball",20);
		hashmap.put("Dog", 30);
		
		hashmap.display();
		
		int element = hashmap.get("Apple");
		System.out.println("The element is:" + element);
		
		element = hashmap.remove("Ball");
		System.out.println("The element is:" + element);
		
		hashmap.display();
		hashmap.put("Ball", 40);
		hashmap.display();
		
		hashmap.put("Ball", 70);
		hashmap.display();
		
	}
	
	/**
	 * 
	 */
	public void testCollectionsImplementation() {
		
		Map<String , Integer> map = new Hashtable<>();
		
		map.put("Apple",10);
		map.put("Ball", 20);
		map.put("Dog",30);
		
		map.get("Apple");
		map.remove("Ball");
		
		map.clear();
		
		map.isEmpty();
		map.keySet();
		
		map.replace("Dog", 50);
		
		
	}
}
