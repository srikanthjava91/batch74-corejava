package com.java8features01;

interface In4 {
	void hello();
}

public class TestJ8Demo4 {

	public static void main(String[] args) {

		In4 i = () -> {
			System.out.println("Hello Guys, Java 8 is More More More Simple than Java ");
			System.out.println("Hello Guys, Java 8 is More More More Simple than Java ");
		};

		i.hello();

	}

}
