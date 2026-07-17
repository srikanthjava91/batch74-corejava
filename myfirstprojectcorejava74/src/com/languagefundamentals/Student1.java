package com.languagefundamentals;

//WAP to find Total_marks & avg of 10th class student..? 
//99 98 97 96 95 94 
public class Student1 {

	void main() {
		System.out.println("welcome to Vcube !!");

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		
		double total_marks = 0;  
		double avg = 0;
		
		for(int m:marks) {
			total_marks = total_marks + m;
		}
		
		avg = total_marks/marks.length;
		
		System.out.println("Total marks of the STudent  " + total_marks);
		System.out.println("avg of all marks  : " + avg );
	}

}
