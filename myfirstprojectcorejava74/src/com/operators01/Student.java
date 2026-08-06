package com.operators01;

//WAP to print total_marks of the student + avg of the student marks.
//99 98 97 94 45 90
public class Student {

	void main() {
		System.out.println("main method strated ");

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double total_marks = 0;// 99+98 = 197+97= 294+96 = 390+ 95 = 485 +94 = 579
		double avg = 0;

		for (int m : marks) {
			total_marks = total_marks + m;
		}

		avg = total_marks / marks.length;//96

		System.out.println("Total marks :" + total_marks);
		System.out.println("Avg of all marks : " + avg);

	}

}
