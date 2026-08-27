package com.accessmodifiers01;

public class TestAccessDemo2 {

	public static void main(String[] args) {

		System.out.println("main method started from TestAccessDemo2");

		////	The constructor TestAccessDemo1() is not visible if constructor is private 
//		TestAccessDemo1 t1 = new TestAccessDemo1();

		TestAccessDemo1 t1 = new TestAccessDemo1();
		////		Note : We cannot access private data members outside of the classes.
//		System.out.println(t1.a1);//The field TestAccessDemo1.a1 is not visible
//		System.out.println(t1.name1);//The field TestAccessDemo1.name1 is not visible
//		t1.method1();//The method method1() from the type TestAccessDemo1 is not visible

		////		 Accessing the default data members outside the class but same package 
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		//// Accessing the public data members outside the class but same package
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		//// Accessing the protected data members outside the class but same package
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

	}

}
