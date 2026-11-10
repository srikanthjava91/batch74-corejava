package com.collections;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedListDemo1 {

	public static void main(String[] args) {

		List<Integer> li = new LinkedList<>();
		
		li.add(7);
		li.add(1);
		li.add(18);
		li.add(45);
		li.add(77);
		li.add(33);
		li.add(10);
		li.add(8);
		li.add(34);
		li.add(4);
		li.add(9);
		li.addFirst(100);
		li.addLast(200);
		
		System.out.println(li);

	}
}
