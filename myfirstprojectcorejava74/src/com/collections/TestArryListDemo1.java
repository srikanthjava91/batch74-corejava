package com.collections;

import java.util.ArrayList;

public class TestArryListDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(9);
		al.add(92);
		al.add(91);
		
		al.add(45);
		al.add(50);
		al.add(60);
		
		al.add(70);
		al.add(15);
		al.add(20);
		al.add(32);
		
		al.add(100);
		al.add(10);
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println("main method ended ");
	}

}
