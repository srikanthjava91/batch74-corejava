package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Iterator is Universal Cursor 
public class TestCollectionDemo5 {

	public static void main(String[] args) {
		Collection<String> names = new ArrayList<>();

		names.add("virat");
		names.add("Rohit");
		names.add("Dhoni");
		names.add("Jadeja");
		names.add("Bumrah");
		names.add("Gill");
		names.add("Hardik");

//		Converting Collections To Array 
		Object[] objs = names.toArray();
		for (Object ob : objs) {
			System.out.println(ob);
		}

		System.out.println("***********Fail Fast ************");
		for (String name : names) {
			System.out.println(name);

//			ConcurrentModificationException 
//			if (name.equals("Dhoni")) {
//				names.remove(name);
//			}
		}

		System.out.println("***************************");
//		 Representing the elements one after another with the help of Iterator
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());

			String name = itr.next();
			if (name.equals("Dhoni")) {
				itr.remove();
			}
		}

		System.out.println(names);

	}

}
