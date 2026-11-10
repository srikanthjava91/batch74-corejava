package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSetDemo1 {

	public static void main(String[] args) {
		SortedSet<Integer> ss = new TreeSet<>();
//		ss.add(null);
//		ss.add(null);
		ss.add(1);
		ss.add(5);
		ss.add(2);
		ss.add(3);
		ss.add(4);
		ss.add(6);
		
		System.out.println(ss);
		System.out.println(ss.first());//1
		System.out.println(ss.last());//6
//		Returns a view of the portion of this set whose elements are strictly less than toElement. 
		System.out.println(ss.headSet(4));//1 2 3
//		Returns a view of the portion of this set whose elements are greater than or equal to fromElement. 
		System.out.println(ss.tailSet(4));//4 5 6
		System.out.println(ss.subSet(2, 5));//2 3 4
		System.out.println(ss.reversed());
	}

}
