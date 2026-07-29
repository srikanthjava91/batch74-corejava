package com.operators01;

//WAP to print total_marks of the student + avg of the student marks.
//99 98 97 94 45 90
public class Student {

	void main() {
		System.out.println("main method started ");

		int[] marks = { 99, 98, 97, 94, 45, 90 };

		double total_marks = 0;
		double avg = 0;

		for (int m : marks) {
			total_marks = total_marks + m;
		}

		avg = total_marks / marks.length;

		System.out.println("Total marks : " + total_marks);
		System.out.println("AVg of al marks : " + avg);

	}

}
