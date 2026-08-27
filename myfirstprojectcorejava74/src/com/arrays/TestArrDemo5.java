package com.arrays;

//WAP to print Total_marks & avg of the Student marks ..? 
//
public class TestArrDemo5 {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double total_marks = 0;// 99 +98 = 197+97 = 294+96 = 390 +95 = 485+94 = 579
		double avg = 0;

//		for (int i = 0; i < marks.length; i++) {
//			total_marks += marks[i];
//		}

//		for (int m : marks) {
//			total_marks += m;
//		}

		avg = total_marks / marks.length;

		System.out.println("Student Total marks : " + total_marks);
		System.out.println("Avg of all the marks : " + avg);

	}
}
