package com.stringhandling;

public class TestStrDemo1 {

	public static void main(String[] args) {

		String str1 = "Java";// --> 1 Object --> String Literal --> String Constant Pool
		String str5 = "Java";// --> 0 objects

		String str2 = new String("Srikanth");// 2 Objects --> String new keyword --> 1-Heap Memory, 2-SCP
		String str6 = new String("Srikanth");// 1 object only in Heap

		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str6));

		String str3 = "Vcube" + "Java";// Concatenation

		String str4 = str3;// Re-assiging the Object

		System.out.println(str1);
		System.out.println(str5);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str5));

	}

}
