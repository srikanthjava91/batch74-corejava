package com.logicalstatements;

import java.util.Scanner;

//How to get a Job and explain the Job criteria ..? 
public class TestLSDemo5 {

	public static void main(String[] args) {

		System.out.println("Welcome to Vcube Process ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you attending daily classes ..? ");
		boolean dcStatus = sc.nextBoolean();

		System.out.println("Attendance Percentage ..? ");
		double attendancePercetange = sc.nextDouble();

		System.out.println("Are you attending Weekly Test ..? ");
		boolean wtStatus = sc.nextBoolean();

		System.out.println("What is the markss % ..?  ");
		double marksP = sc.nextDouble();

		System.out.println("Are you attending Mockup interviews ..? ");
		boolean miStatus = sc.nextBoolean();

		System.out.println("How many mock up interviews you attended ..? ");
		int mockAttendance = sc.nextInt();

		if (dcStatus && attendancePercetange >= 80 && wtStatus && marksP >= 50.00 && miStatus && mockAttendance > 95) {
			System.out.println("JOb Guaranty !!");
		} else {
			System.out.println("God will save you !!");
		}

	}

}
