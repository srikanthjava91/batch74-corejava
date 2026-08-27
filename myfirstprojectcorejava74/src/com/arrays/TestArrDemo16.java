package com.arrays;

import java.util.Arrays;

//Insertion Sorting  
public class TestArrDemo16 {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 3, 1, 2, 7 };

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];// 2
			int j = i;

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}

			arr[j] = temp;

		}

		System.out.println(Arrays.toString(arr));
	}

}
