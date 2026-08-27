package com.arrays;

public class TestArrDemo4 {

	public static void main(String[] args) {

		int[] arr = { 45, 18, 7, 1, 8, 44 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

//		for (int a : arr) {
//			if (a % 2 == 0) {
//				System.out.print(a + " ");
//			}
//		}

	}

}
