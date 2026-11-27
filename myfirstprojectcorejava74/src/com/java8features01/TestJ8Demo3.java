package com.java8features01;

interface In3 {
	int sum(int n);
}

public class TestJ8Demo3 {

	public static void main(String[] args) {

		In3 i = n -> {
			return n + n;
		};
		System.out.println(i.sum(100));
	}
}
