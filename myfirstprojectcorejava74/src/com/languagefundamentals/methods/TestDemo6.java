package com.languagefundamentals.methods;

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestDemo6 t = new TestDemo6();
		System.out.println(t.method1());
		System.out.println(t.method2());

	}

	double method3(int a, int b, float c, double d) {
		return 10;
	}

	int method1() {
		char c = 'A';
		return c;
	}

	char method2() {
		return 100;
	}

}
