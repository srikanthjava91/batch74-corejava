package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSetDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		SortedSet ss1 = new TreeSet();
//		ss1.add(5);
//		ss1.add(15);
//		ss1.add(55);
//		ss1.add(45);
//		ss1.add(35);
//		ss1.add(5);
		ss1.add("one");

		System.out.println(ss1);

		Set<Integer> s = new LinkedHashSet<>();
		s.add(3);// 3%16 = 3
		s.add(18);// 18%16 = 2
		s.add(38);// 38%16 = 6
		s.add(32);// 32 % 16 = 0
		s.add(45);// 45%16 = 13
		s.add(72);// 72%16 = 8
		s.add(16);// 0

		System.out.println(s);// 32 16 18 3 38 72 45

		Set<String> ss = new HashSet<>();
		ss.add("J2SE");
		ss.add("J2EE");
		ss.add("J2ME");
		ss.add("J2SE");
		ss.add("J2SE");
		ss.add("DAO");
		ss.add("SQL");
		ss.add(null);

		System.out.println(ss);

	}
}
