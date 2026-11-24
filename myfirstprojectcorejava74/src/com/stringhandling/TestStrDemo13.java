package com.stringhandling;

public class TestStrDemo13 {

	public static void main(String[] args) {
		String s1 = new String("Java");// Heap Area
		String s2 = "Java";// SCP
		s1 = s1.intern();
		System.out.println(s1 == s2);// true
	}
}
