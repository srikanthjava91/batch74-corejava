package com.languagefundamentals;

public class TestVariablesDemo1 {

	static String s1 = "Vcube";

	public static void main(String[] args) {

		var i = 10;

		var s1 = "Jitendra"; // --> SCP --> String Constant Pool --> Heap --> 1 object
		var s2 = "Jitendra"; // --> 0 objects

		var s3 = "Srikanth";// SCP --> 1 object
		String s4 = "Srikanth";

		String s5 = new String("Srinu");// 1 Heap + 1 SCP
		String s6 = "Srinu";// 0 objects
		
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));

		System.out.println(TestVariablesDemo1.s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

	}

}
