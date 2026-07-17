package com.operators01;

public class TestUnaryOpDemo2 {

	public static void main(String[] args) {

		int x = 5;
		int y = 7;

		System.out.println(--x);// 4
		System.out.println(x--);// 4 --> 3
		System.out.println(++x);// 4
		System.out.println(++x);// 5
		System.out.println(--x);// 4
		System.out.println(x--);// 4 --> 3
		System.out.println(++x);// 4
		System.out.println(x++);// 4 --> 5

		System.out.println(--y);// 6
		System.out.println(--y);// 5
		System.out.println(y++);// 5 --> 6
		System.out.println(++y);// 7
		System.out.println(++x);// 6
		System.out.println(--y);// 6
		System.out.println(y--);// 6 --> 5

		// x=6 y=5 --> 9 --> 6
		// 6 + 5 = 11 - 6 = 5 + 8
		System.out.println(x++ + y++ - y-- + ++x);// 13

//		8+ 5 = 13 + 6=19 -10 = 9 
		System.out.println(x++ + y++ + y-- - ++x);

//		System.out.println("X value is : " + x);//
//		System.out.println("Y value is : " + y);//

	}

}
