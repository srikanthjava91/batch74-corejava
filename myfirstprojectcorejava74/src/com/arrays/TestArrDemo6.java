package com.arrays;

//WAP to print Array in Reverse Order ..? 
public class TestArrDemo6 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };// 0 1 2 3 4 --> 4 3 2 1 0

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
