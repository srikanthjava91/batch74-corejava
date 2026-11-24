package com.stringhandling;

public class TestStrDemo12 {

	public static void main(String[] args) {
		String s1 = "java is always simple in Vcube at JNTU";// 0 1 2 3
		System.out.println(s1.indexOf('a',s1.indexOf('a',s1.indexOf('a', s1.indexOf('a')+1)+1)+1));
		System.out.println(s1.indexOf('a'));// 1
		System.out.println(s1.lastIndexOf('a'));// 31
	}
}
