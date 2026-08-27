package com.accessmodifiers02;

import com.accessmodifiers01.TestAccessDemo1;

public class TestAccessDemo3 extends TestAccessDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestAccessDemo1 t1 = new TestAccessDemo1();

//		Even though, your class is public, constructor is public, you imported class 
//		But, your data members are default so we cannot access outside of the packages.
//		System.out.println(t1.a2);
//		System.out.println(t1.name2);
//		t1.method2();

		////		Accessing the public data members outside the packages
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		//// Accessing the protected data members outside the packages is not possible
//			System.out.println(t1.a4);
//			System.out.println(t1.name4);
//			t1.method4();

		TestAccessDemo3 t3 = new TestAccessDemo3();
		System.out.println(t3.a4);
		System.out.println(t3.name4);
		t3.method4();

	}

}
