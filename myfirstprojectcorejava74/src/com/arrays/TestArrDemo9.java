package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//WAP to read the elements from a Console using Scanner ..? 
public class TestArrDemo9 {

	boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Size :");
		int size = sc.nextInt();// 5

		int[] arr = new int[size];// 0 1 2 3 4 --> 0 0 0 0 0

		System.out.println("Enter the elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		 Representing Prime numbers
		System.out.println("Representing Prime numbers : ");
		for (int a : arr) {
			if (isPrime(a)) {
				System.out.print(a);
			}
		}
//		System.out.println(Arrays.toString(arr));
	}
}
