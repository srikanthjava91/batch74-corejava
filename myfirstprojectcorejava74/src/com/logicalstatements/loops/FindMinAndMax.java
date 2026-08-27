package com.logicalstatements.loops;

//WAP to print min & max from a Given array ..? 
public class FindMinAndMax {

	void main() {
		System.out.println("hello good morning ");

		int[] numbers = { 3, 4, 2, 1 };// 0 to n-1

		int min = numbers[0];// 9 1 -5
		int max = numbers[0];// 9

		for (int n : numbers) {

			if (n < min) {
				min = n;
			}

			if (n > max) {
				max = n;
			}

		}
		System.out.println("Min number from an array : " + min);
		System.out.println("Maximum number from an array : " + max);
	}
}
