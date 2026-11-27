package com.stringhandling;

public class TestStrBuffDemo3 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());// 16

		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println(sb2.capacity());//20
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("SrikanthSrikanthSrikanthSrikanth");
		sb3.append("SrikanthSrikanthSrikanthSrikanthSrikanth");
		sb3.append("Sri");
		System.out.println(sb3.capacity());//16--> 34 --> 40 --> 70  
		
		StringBuffer sb4 = new StringBuffer("Java");//20
		sb4.append("SrikanthSrikanthSrikant");
		System.out.println(sb4.capacity());
		
		StringBuffer sb5 = new StringBuffer();
		sb5.ensureCapacity(35);
		System.out.println(sb5.capacity());//100
		

	}

}
