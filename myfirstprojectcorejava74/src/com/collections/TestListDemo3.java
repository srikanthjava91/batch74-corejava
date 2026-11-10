package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListDemo3 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Java");
		names.add("Advanced Java ");
		names.add("Spring");
		names.add("Spring Boot ");
		names.add("React");
		names.add("SQL");
		names.add("JS");
		names.add("BS");

		System.out.println(names);

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("******************************");
		
		
		ListIterator<String> litr =names.listIterator();
		
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("--------------------------");
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
	}
}
