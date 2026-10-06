package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try ");
			String s = null;
			System.out.println(s.length());//null dot any operation is NPE 
			
			String s1 = "null";
			System.out.println(s1.length());
			
			String s2 = "";
			System.out.println(s2.length());
			
		}catch(Exception a) {
//			System.err.println("in catch ");
//			System.err.println(a.toString());
			System.err.println(a);
		}
		
		System.out.println("Hello");
		System.out.println("main method ended");

	}

}
