package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrDemo15 {

	void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("How many time you want to Rotate ..? ");
		int r = sc.nextInt();

		arrayRotation(arr, r);

		System.out.println("After Array Rotation : ");
		System.out.println(Arrays.toString(arr));
	}

	void arrayRotation(int[] arr, int r) {

		int start = 0;
		int end = arr.length - 1;

		r = r % arr.length;

//		1 2 3 4 5 6 7 8
//		Step1 : Reverse Full Array 
//		8 7 6 5 4 3 2 1 
		reverseArray(arr, start, end);

		
//		8 7 6 5 4 3 2 1 
//		Step2 : Reverse First half Array 
//		5 6 7 8 4 3 2 1
		reverseArray(arr, start, r - 1);

//		5 6 7 8 4 3 2 1
//		Step3 : Reverse Second Half Array 
//		5 6 7 8 1 2 3 4
		reverseArray(arr, r, end);

	}

//	1 2 3 4 5 6 7 8     --> 0 ---> 7 
	void reverseArray(int[] arr, int start, int end) {
		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
