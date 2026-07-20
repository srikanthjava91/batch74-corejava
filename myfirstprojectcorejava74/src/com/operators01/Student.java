package com.operators01;

//WAP to find the total_marks + avg of all the marks of the student..
//99 98 97 96 95 94 
public class Student {

	void main() {
		System.out.println("Welocme to Vcube !!");

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double total_marks = 0;
		double avg = 0;

		for (int m : marks) {
			total_marks = total_marks + m;
		}
		avg = total_marks / marks.length;

		System.out.println("Total Marks : " + total_marks);
		System.out.println("Avg of all the marks : " + avg);

	}

}
