package com.arrays;

import java.util.Arrays;

public class TestArrDemo13 {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 4, 2, 1, 2, 3, 9, 10 };
		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;// 0 1 3
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println("After  Sorting : ");
		System.out.println(Arrays.toString(arr));
	}
}
