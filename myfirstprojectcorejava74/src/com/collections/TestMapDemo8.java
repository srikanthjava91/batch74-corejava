package com.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestMapDemo8 {

	public static void main(String[] args) {
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(11, "Rohit");
		map.put(2, "Nithish");
		map.put(3, "Abhishek");
		map.put(4, "Srikanth");
		map.put(5, "Dhoni");

		Set<Entry<Integer, String>> entries = map.entrySet();

		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " -" + entry.getValue());
			map.put(18, "Virat");
		}
		
		System.out.println(map);

	}

}
