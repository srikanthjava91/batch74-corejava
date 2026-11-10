package com.collections;

import java.util.IdentityHashMap;
import java.util.Map;


//HashMap is working based on .equals() method 
//IdentityHashMap is working based on == Operator
public class TestMapDemo5 {

	public static void main(String[] args) {
		Map<String, String> names = new IdentityHashMap<>();

//		String Literals 
		String s3 = "Java";
		String s4 = "Java";
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s3));

//		String Object
		
		String s1 = new String("J");
		System.out.println(System.identityHashCode(s1));
		String s2 = new String("J");
		System.out.println(System.identityHashCode(s2));

		names.put(s1, "Java is Difficult in differnt institutes");
		names.put(s2, "Java is Simple in Vcube");
		
		System.out.println(names.get(s1));
		System.out.println(names.get(s2));

		System.out.println(names);

	}

}
