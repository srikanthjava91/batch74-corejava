package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo4 {

	public static void main(String[] args) {

		Collection<Integer> c1 = new ArrayList<>();

		c1.add(9);

		if (c1.isEmpty()) {
			c1.add(45);
			c1.add(15);
			c1.add(5);
			c1.add(50);
			c1.add(10);
		}

		System.out.println(c1);

	}
}
