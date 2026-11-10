package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSetDemo1 {

	public static void main(String[] args) {

		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(600);
		ns.add(500);
		ns.add(400);
		ns.add(300);
		ns.add(100);
		ns.add(1200);
		ns.add(1000);
		ns.add(100);
		ns.add(900);
		ns.add(1500);

		System.out.println(ns);
//		Returns the greatest element in this set less than or equal to the given element, 
//		or null if there is no such element.
		System.out.println(ns.floor(500));

//		Returns the least element in this set greater than or equal to the given element, 
//		or null if there is no such element.
		System.out.println(ns.ceiling(1600));

//		Returns the least element in this set strictly greater than the given element, or null if there is no such element.
		System.out.println(ns.higher(500));

		// Returns the greatest element in this set strictly less than the given
		// element, or null if there is no such element.
		System.out.println(ns.lower(700));

	}

}
