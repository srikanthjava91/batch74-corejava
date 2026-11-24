package com.stringhandling;

public class TestStrDemo3 {

	public static void main(String[] args) {

		String s1 = "Mahendar Singh";
		String s2 = "Dhoni";
		s1 = s1.concat(s2);
		System.out.println(s1);

		String s3 = "Srikanth";
		String s4 = "Java";

		System.out.println(s3.concat(s4) == s3 + s4);
		System.out.println(System.identityHashCode(s3.concat(s4)));
		System.out.println(System.identityHashCode(s3 + s4));
	}
}
