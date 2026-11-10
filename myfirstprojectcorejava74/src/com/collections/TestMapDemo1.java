package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(7, "Dhoni");
		map.put(18, "Virat");
		map.put(45, "Rohit");
		map.put(1, "Rahul");
		map.put(3, "Vaibhav");
		map.put(33, "Hardhik");
		map.put(33, "Krunal");
		map.put(9, "Srikanth");
		map.put(19, "Srikanth");
		System.out.println(map);

	}

}
