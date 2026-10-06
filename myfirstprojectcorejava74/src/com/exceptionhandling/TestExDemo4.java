package com.exceptionhandling;

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = new int[4];// 0 1 2 3

		try {
			arr[0] = 101;
			arr[1] = 102;
			arr[2] = 103;
			arr[3] = 104;
			arr[4] = 105;// ArrayIndexOutOfboundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("main method ended ");
	}
}
