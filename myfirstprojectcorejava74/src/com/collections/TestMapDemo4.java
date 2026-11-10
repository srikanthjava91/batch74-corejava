package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo4 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("J", "Java");
		map.put("S", "SQL");
		map.put("R", "React");

		System.out.println(map.getOrDefault("A", "J2SE"));
		map.putIfAbsent("K", "J2ee");

		System.out.println(map);
	}

}
