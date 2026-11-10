package com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSetDemo2 {

	public static void main(String[] args) {
		
//		Constructs a new, empty set; 
//		the backing HashMap instance has default initial capacity (16) and load factor (0.75).
		Set<Integer> s = new HashSet<>();
		
//		add method internally adding 11 to the map like below 
//		map.put(e, PRESENT)==null
//		map.put(11, new Object())
//		map.put(1, new Object())
//		map.put(34, new Object())
		s.add(11);//11
		s.add(1);//1
		s.add(34);//2
		s.add(46);//14
		s.add(18);//2
		s.add(92);//12
		s.add(45);//13
		s.add(16);//0
		s.add(32);//0
		s.add(10);//10
		s.add(20);//10
		s.add(30);//10
		s.add(40);//10
		
		System.out.println(s);//16 32 1 34 18 10 11 92 45 46 
		
	}

}
