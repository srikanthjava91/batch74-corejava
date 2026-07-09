package com.languagefundamentals.methods;

import java.util.Scanner;

//iv) WIth return type + with arguments 
//Q WAP to print the Areas of Triangle, Rectangle, Circle & Square.
//triangle : 0.5 * base * height 
//Rectangle Length * breadth 
//Square : side * side 
//Circle : PI * r * r 

public class TestDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		TestDemo5 t = new TestDemo5();

		System.out.println("********** Area of Traingle ");
		System.out.println("Enter base : ");
		double b = sc.nextDouble();

		System.out.println("Enter Height ");
		double h = sc.nextDouble();

		double arTri = t.findAreaOfTriangle(b, h);
		System.out.println("Area Of Triangle is : " + arTri);

		System.out.println("********Area of Circle ***************");
		System.out.println("Enter Radius: ");
		double r = sc.nextDouble();

		double arCir = t.findAreaOfCircle(r);
		System.out.println("Area of Circle is : " + arCir);

		System.out.println("main method ended ");
	}

	double findAreaOfCircle(double radius) {
		return Math.PI * radius * radius;

	}

	double findAreaOfTriangle(double base, double height) {
		double arTri = 0.5 * base * height;
		return arTri;
	}
}
