package com.java8features01;

@FunctionalInterface
interface In1 {
	public abstract void method1();
}

public class TestJ8Demo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		In1 t = () -> {
			System.out.println("Hello method1 called ");
		};
		t.method1();
	}

}
