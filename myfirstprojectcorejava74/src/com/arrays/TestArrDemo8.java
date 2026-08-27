package com.arrays;

import java.util.Arrays;

//WAP to add two array values into another array.
//input : 
//int a1[] = {1,2,3}
//int a2[] = {4,5,6}

//output : 
//int a3[] = {1,2,3,4,5,6}
public class TestArrDemo8 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		int[] a1 = { 1, 2, 3 };// 0 1 2
		int[] a2 = { 4, 5, 6 };// 0 1 2

		int[] a3 = new int[a1.length + a2.length];// 0 1 2 3 4 5 --> 0 0 0 0 0 0

		for (int i = 0; i < a1.length; i++) {
			a3[i] = a1[i];
		}

		for (int i = 0; i < a2.length; i++) {
			a3[a1.length + i] = a2[i];
		}

		System.out.println(Arrays.toString(a3));

	}

}
