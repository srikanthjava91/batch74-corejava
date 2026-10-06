package com.oops01.polymorphism;

public class TestMOLDemo3 {

	void main(String[] args) {
		System.out.println("main method started ");
		hello("Srikanth");
		hello(null);//The method hello(Integer) is ambiguous for the type TestMOLDemo3
		
	}

	void hello(Integer name) {
		System.out.println("hello String method called :" + name);
	}
	
//	void hello(String name) {
//		System.out.println("hello String method called :" + name);
//	}

	void hello(Object obj) {
		System.out.println("hello Object method called  :" + obj);
	}

}
