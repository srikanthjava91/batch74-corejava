package com.arrays;

public class TestArrDemo3 {

	public static void main(String[] args) {

		//The literal 2147483648 of type int is out of range 
		String[] names = new String[5];

		names[0] = "Abhishek";
		names[1] = "Ram";
		names[2] = "Surya";
		names[3] = "Rahul";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("---------------------------");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
