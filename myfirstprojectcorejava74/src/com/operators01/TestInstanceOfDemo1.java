package com.operators01;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class A {

}

class B extends A {

}

//instanceof : Whenever we want to check the Object reference variables 
//Whetherth e Reference variable is from Specified Object or not ..?
public class TestInstanceOfDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		List<Integer> l = new CopyOnWriteArrayList<>();//
		l.add(10);
		l.add(20);

		System.out.println(l);
		
		
		System.out.println("********************");

		Integer i1 = 10;
		System.out.println(i1 instanceof Integer);// true
		System.out.println(i1 instanceof Number);// true
		System.out.println(i1 instanceof Object);// true

//		/Incompatible conditional operand types Integer and String
//		System.out.println(i1 instanceof String);//CE 

		System.out.println(null instanceof Integer);

		Number n1 = 100;
		System.out.println(n1 instanceof Integer);// true

		A a = new A();
		B b = new B();

		System.out.println(b instanceof B);// true
		System.out.println(b instanceof A);// true
		System.out.println(a instanceof A);// true
		System.out.println(a instanceof B);// false

	}
}
