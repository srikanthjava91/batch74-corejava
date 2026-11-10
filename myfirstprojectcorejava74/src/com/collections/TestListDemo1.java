package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListDemo1 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(9);
		l.add(1);
		l.add(7);
		l.add(8);
		l.add(23);
		l.add(33);
		l.add(45);
		l.add(18);
		l.add(1);
		l.add(8);
		l.add(33);
//		l.add(null);
//		l.add(null);
		
		Collections.sort(l);
		System.out.println(l);
		

//		l.add(10);
//		l.add("java");
//		l.add("java");
//		l.add("java");
//		l.add("java");
//		l.add('A');
//		l.add(9.6F);
//		l.add(null);
//		l.add(null);
//		l.add(null);
//		System.out.println(l);

	}

}
