package com.logicalstatements.loops;

import java.util.Scanner;

//An Armstrong number is a number where 
//the sum of its digits raised to the power of the number of digits 
//equals the number itself. 
//For example, 153 is an Armstrong number because (1^3 + 5^3 + 3^3 = 153).
//Q) WAP to print the the Given number is Armstrong or not ..?

//153 => 3 =>  1^3 + 5^3 + 3^3
//370 => 3 => 3^3 + 7^3 + 0 
//371 => 3 => 3^3 + 7^3 + 1^3

//1634 => 4 => 1^4 +  6^4 + 3^4 + 4^4 = 1634
public class TestLPDemo16 {

	public static void main(String[] args) {
		System.out.println("main method startd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");// 153
		int n = sc.nextInt();

		boolean status = isArmStrong(n);

		if (status) {
			System.out.println("The Given Number is Armstrong ");
		} else {
			System.out.println("The Given number is not an Armstrong ");
		}
	}

	static boolean isArmStrong(int n) {
		boolean status = false;
		int temp = n;
//		int n1 = n;
		
		int sumP = 0;
		int r = 0;
//		int count = 0;

		String str = Integer.toString(n);// 1634
		int digitCount = str.length();// 4
		
//		while(n1>0) {
//			n1 = n1/10;
//			count++;
//		}

		while (n > 0) {
			r = n % 10;// 1 5 3
			n = n / 10;
//			sumP = sumP + r * r * r;
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}

		if (sumP == temp) {
			status = true;
		}

		return status;

	}

}
