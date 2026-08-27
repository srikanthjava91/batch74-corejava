package com.arrays;

//WAP to find min & max from given Array ..? 
//
public class TestArrDemo7 {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 1, 5 };

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}

//		for (int a : arr) {
//			if (a < min) {
//				min = a;
//			} else if (a > max) {
//				max = a;
//			}
//		}

		System.out.println("minimum value from an array is  : " + min);
		System.out.println("Maximum value from an array is  : " + max);

	}

}
