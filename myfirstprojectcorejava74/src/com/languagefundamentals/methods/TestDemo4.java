package com.languagefundamentals.methods;

import java.util.Scanner;

//iii) With return type + no arguments 
public class TestDemo4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestDemo4 t4 = new TestDemo4();

		double sal = t4.getEmployeeSalary();
		double bon = t4.getBonus();

		System.out.println("Total Salary : " + (sal + bon));

		System.out.println("main method ended ");
	}

	double getEmployeeSalary() {
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	double getBonus() {
		System.out.println("Enter bonus : ");
		double bonus = sc.nextDouble();
		return bonus;
	}

}
