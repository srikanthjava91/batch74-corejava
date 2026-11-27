package com.java8features01;

@FunctionalInterface
interface In2 {
	int addition(int a, int b);
}

public class TestJ8Demo2 {

	public static void main(String[] args) {

		In2 t = (a, b) -> {
			int c = a + b;
			return c;
		};
		System.out.println(t.addition(100, 200));
	}
}
