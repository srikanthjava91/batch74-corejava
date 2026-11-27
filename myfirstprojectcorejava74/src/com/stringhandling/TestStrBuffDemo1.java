package com.stringhandling;

public class TestStrBuffDemo1 {

	public static void main(String[] args) {
		////Type mismatch: cannot convert from String to StringBuffer
//		StringBuffer sb1 = "Srikanth";

//		StringBuffer & StringBuilder both are mutable.

		// Slow- Thread-safe
		StringBuffer sb = new StringBuffer("Srikanth");
		System.out.println(sb);
		sb.append("Java");
		System.out.println(sb);// SrikanthJava

		// fast- not-Thread-safe
		StringBuilder sb2 = new StringBuilder("Srikanth");
		System.out.println(sb2);
		sb2.append("Java");
		System.out.println(sb2);// SrikanthJava
	}

}
