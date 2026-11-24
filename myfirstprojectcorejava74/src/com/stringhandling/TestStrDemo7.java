package com.stringhandling;

public class TestStrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		char[] data = {'a','b','c'};
		String s1 = String.copyValueOf(data);
		System.out.println(s1);
		
		String[] names = { "Dhoni", "Virat", "Rohit", "Rahul", "Hardhik", "Abhishek", "Srikant" };

		for (String name : names) {
			if (name.toLowerCase().startsWith("r") || name.toLowerCase().endsWith("k")  || name.toLowerCase() .contains("dh")) {
				System.out.println(name);
			}
		}
	}
}
