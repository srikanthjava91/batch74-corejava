package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo1 {

	public static void main(String[] args) {

//		Collection is a raw type. 
//		References to generic type Collection<E> should be parameterized
		Collection<Integer> c = new ArrayList<>();

		c.add(10);
		c.add(10);
		c.add(7);
		c.add(18);
		c.add(45);
		c.add(33);
		c.add(77);
		c.add(3);

		System.out.println(c);

		Collection<String> names = new ArrayList<>();
		names.add("Dhoni");
		names.add("Sachin");
		names.add("Virat");
		names.add("Srikanth");
		names.add("Rahul");
		names.add("Rohit");

		System.out.println(names);

	}
}
