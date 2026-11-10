package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListDemo2 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		System.out.println(li.size());

		li.add(6);
		li.add(3);
		li.add(1);
		li.add(0, 10);
		li.add(1, 50);
		li.add(2);
		li.add(5);
		li.add(1, 20);
		li.add(2, 50);
		li.add(4, 60);
		li.add(4);
		li.set(4, 600);
		System.out.println(li.get(8));
		li.remove(li.indexOf(20));
		System.out.println(li);// 10 20 50 50 60 6 3 1 2 5 4
		// 10 30 50 60 6 3 1 2 5 4

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("*******************");
		for (int a : li) {
			System.out.println(a);
		}
		System.out.println("***********************");
		Iterator<Integer> itr = li.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
