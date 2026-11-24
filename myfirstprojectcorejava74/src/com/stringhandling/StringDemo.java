package com.stringhandling;

public final class StringDemo {
	private final String str;

	StringDemo(String s) {
		this.str = s;
	}

	public String get() {
		return str;
	}

	public static void main(String[] args) {
		StringDemo s1 = new StringDemo("Java");
		System.out.println(s1.str);

		StringDemo s2 = new StringDemo("Spring");
		System.out.println(s2.str);
	}
}
