package com.languagefundamentals.constructors;

//WAP to find total_marks & avg of 10th class student ..? 
//99 98 97 96 95 94
public class Student1 {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		
		double total_marks = 0;
		double avg = 0;
		
		
		for(int m : marks) {
			total_marks = total_marks + m;
		}
		
		avg = total_marks/marks.length;
		
		System.out.println("Total marks : " +total_marks);
		System.out.println("Avg of all maks : " + avg);

	}

}
