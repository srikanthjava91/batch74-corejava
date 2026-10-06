package com.oops01.polymorphism;

public class TestMOLDemo2 {

	void main(String[] args) {
		System.out.println("main method started ");
		addition();
		addition(100);

//		 The method addition(int, float) is ambiguous for the type TestMOLDemo2
//		addition(10, 10);

	}

//	void addition(int a, int b) {
//		System.out.println("int a int b addition method called ");
//	}

	void addition(int a, float b) {
		System.out.println("int a float b addition method called ");
	}

//
	void addition(float a, int b) {
		System.out.println("float a int b addition method called ");
	}
	////
	void addition(float a, float b) {
		System.out.println("float a float b addition method called ");
	}

	void addition() {
		System.out.println("no arg adition method called ");
	}

//	void addition(int i) {
//		System.out.println("one arg int adition method called " + i);
//	}
//	
	void addition(float i) {
		System.out.println("one arg float adition method called " + i);
	}

	void addition(long i) {
		System.out.println("one arg long adition method called " + i);
	}

}
