package com.stringhandling;

public class TestStrDemo11 {

	public static void main(String[] args) {

		TestStrDemo11 t1 = new TestStrDemo11();

		int a = 0x2b2fa4f7;
		System.out.println(a);
		System.out.println(t1);// 2b2fa4f7
		System.out.println(t1.hashCode());// 724542711

		String s = new String("AB");
		System.out.println(s);
		System.out.println(s.hashCode());

	}
}
