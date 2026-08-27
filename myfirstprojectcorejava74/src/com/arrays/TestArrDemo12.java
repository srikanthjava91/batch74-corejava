package com.arrays;

import java.util.Arrays;

public class TestArrDemo12 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6,2 };
		int temp = 0;

		int count = 0;
		int count1 = 0;

		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
				count1++;
			}

			if (!flag) {
				break;
			}
		}

		System.out.println(count);
		System.out.println(count1);
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
	}

}
