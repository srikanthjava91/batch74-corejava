package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestMapDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		// Constructs a new, empty hashtable with a default initial capacity (11) and
		// load factor (0.75).
		Map<Integer, String> map = new Hashtable<>();
		map.put(11, "Rohit");
		map.put(2, "Nithish");
		map.put(3, "Abhishek");
		map.put(4, "Srikanth");
		map.put(5, "Dhoni");
		map.put(0, "abc");
//		map.put(6, null);
//		map.put(7, null);
//		map.put(8, null);

		System.out.println(map);
	}

}
