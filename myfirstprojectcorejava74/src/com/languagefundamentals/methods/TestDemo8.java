package com.languagefundamentals.methods;

//System is a class from java.lang package 
//out is a static reference variable of PrintStream class
//println() is method from PrintStream class 
//SO if we want to call out we need to use class name 
//so, We called as System.out
//out is a reference variable of PrintStream class
//So, we are calling System.out.println();

//In PrintStream class, 10 println() methods are there to print based on your input.
public class TestDemo8 {
	static String name = "Srikanth";

	public static void main(String[] args) {
		System.out.println(TestDemo8.name.length());// 8
		
		
	}
}
