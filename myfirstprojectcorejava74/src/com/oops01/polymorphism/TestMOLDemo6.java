package com.oops01.polymorphism;

public class TestMOLDemo6 {

	void main(String... args) {
//		add("Hello");
		byte b = 10;
		add(b);
		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 30, 40);
		add(10, 20, 30, 40, 50);
		add(10, 20, 30, 40, 50, 60);
		add(10, 20, 30, 40, 50, 60, 70);
		add(10, 20, 30, 40, 50, 60, 70, 80);
		add(10, 20, 30, 40, 50, 60, 70, 80, 90);
//		int ... numbers = {1,2,3};
		
		char[] ch = {'a','b','c'};
		
//		add(ch);
	}

	// var arg ---> variable argument
//	Instead of creating n number methods for same type of values 
//	we should choose the concept of var-args 
//	Internally var arg is working like array 
//	int... a --> int[] a
//	Q) Can we replace var arg with array ..? 
//	NO, Because the method is expecting array value not direct int values.

//	Q) Can we replace array with var arg ..? 
//	YES !! Example main method we can write with main(String... args)

//	Q) Can we keep any other arguments with var args ..? 
//	Yes, But var arg should the last parameter.

//	Q) If we have two arg method and var arg which one will get first priority ..? 
//	always, the first priority is with same parameters method
//	so it should be two arg method !!

//	Q) Can we write multiple var args in a same method ..? 
//	NO !! In one method we can write only one var arg and that should be the last parameter.

	void add(int a, float b) {
		System.out.println("two arg method called ");
	}

	void add(int... a) {
		System.out.println("var arg method called ");

		int sum = 0;
		for (int a1 : a) {
			sum = sum + a1;
		}
		System.out.println("SUM : " + sum);
	}

}
