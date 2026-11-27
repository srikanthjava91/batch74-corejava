package com.stringhandling;

public class TestStrBufDemo2 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());// 16

		StringBuffer sb2 = new StringBuffer("Srikanth");
		System.out.println(sb2.capacity());// 24
		
		StringBuffer sb3 = new StringBuffer();//16
		sb3.append("SrikanthSrikanthSrikanthsrikanthsri");
		System.out.println(sb3.capacity());//16 -->34 --> 35 
		
		

	}

}
