package com.oops01.polymorphism;


//byte --> short --> int ---> long ---> float ---> double 
public class TestMOLDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started ");// String
		TestMOLDemo1 t = new TestMOLDemo1();
		System.out.println(t);// object

		byte b = 10;
		System.out.println(b);//Auto Promotion 
		
		Integer i1 = 100;
		System.out.println(i1);//Auto Un-Boxing or Object
		
		System.out.println(100);// int
		System.out.println(100L);// long

		System.out.println(5.9F);// float
		System.out.println(756.6745D);// double

		System.out.println('A');
		System.out.println(false);
		
		char[] ch = {'A','P','P'};
		System.out.println(ch);//APP

	}

}
