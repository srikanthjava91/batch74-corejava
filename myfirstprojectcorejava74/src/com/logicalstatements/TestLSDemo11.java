package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo11 {

	static String getGradeDetails(String grade) {
		String gradeDetails = switch (grade) {
		case "A" -> {
			System.out.println("A grade means more than 90 % ");
			yield "Excellent";
//			return "Excellent";//Return within switch expressions not permitted
		}
		case "B" -> {
			System.out.println("B grade means more than 80 % ");
			yield "Good";
		}
		case "C" -> {
			System.out.println("C grade means more than 70 % ");
			yield "avg";
		}
		case "D" -> {
			System.out.println("D grade means more than 50 % ");
			yield "Ok";
		}
		case "E" -> {
			System.out.println("E grade means more than 35% ");
			yield "Passes";
		}

		default -> "Failed";
		};

		return gradeDetails;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade : ");
		String grade = sc.next();

		String details = getGradeDetails(grade);

		System.out.println("Grade Details : " + details);

	}

}
