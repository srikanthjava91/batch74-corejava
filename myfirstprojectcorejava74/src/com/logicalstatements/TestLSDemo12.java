package com.logicalstatements;

public class TestLSDemo12 {

	public static void main(String[] args) {

		System.out.println(getPrice("orn"));
		System.out.println(getPrice("mng"));
	}

	static int getPrice(String item) {

		switch (item) {

		case "orn":
			return 100;

		case "mng":
			return 150;

		default:
			return 0;
		}
	}

}
