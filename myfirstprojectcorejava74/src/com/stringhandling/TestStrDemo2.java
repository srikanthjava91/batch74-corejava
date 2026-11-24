package com.stringhandling;

public class TestStrDemo2 {

	public static void main(String[] args) {

		String s1 = "Dhoni";// 1 object
		String s2 = "Dhoni";// 0 object

		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));// true

		String s3 = new String("CSK");// 2 Object 1 SCP + 1Heap
		String s4 = new String("csk");// 2 Objects 1SCp + 1 Heap

		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));// false
		System.out.println(s3.equalsIgnoreCase(s4));// true
		System.out.println("******************************");

		String city = "Hyderabad";
		String city1 = "Hyderabad";
		String city2 = "Hyderabad";

		System.out.println(city == city1);// true
		System.out.println(city1 == city2);// true
		
		city2 = "Banglore";
		System.out.println(city);
		System.out.println(city1);
		
		String city3 = "Chennai";
		String city4 = city3;
		

	}

}
