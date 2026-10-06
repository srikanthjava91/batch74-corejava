package com.oops01.polymorphism;

//WAP to findArea of a triangle Rectangle Square And Circle 
//Triangle : 0.5 * base * height
//Rectangle : length * breadth 
//Square : side * side 
//Circle PI * r * r 

public class TestMOLDemo4 {

	void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Area of Triangl e: " + findArea(45.5, 16.9));
		System.out.println("Area of Circle : " + findArea(45.5));
		System.out.println("Area of Reactnagle : " + findArea(45.5F, 65.5F));
		System.out.println("Area of Square : " + findArea(70));
		main();
	}
	
	void main() {
		System.out.println("hello main ");
	}

	double findArea(float side) {
		return side * side;
	}

	double findArea(float length, float breadth) {
		return length * breadth;
	}

	double findArea(double r) {
		return Math.PI * r * r;
	}

	double findArea(double base, double height) {
		return 0.5 * base * height;
	}

}
