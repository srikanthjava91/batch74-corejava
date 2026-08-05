package com.logicalstatements.loops;

//WAP to print Total_marks & avg of all the marks ..? 
// 99 98 97 96 95 94 
public class Student {

	void main() {
		System.out.println("Good morning !");

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		int total_marks = 0;//99+98 = 197 +97 = 294  +96 = 390 +95= 485+ 94 = 579
		int avg = 0;
		
		for(int m:marks) {
			total_marks = total_marks + m;
		}
		
		avg = total_marks/marks.length;

		System.out.println("Total marjs of the Student  " + total_marks);
		System.out.println("Avg of all the maraks : " + avg);
	}

}
