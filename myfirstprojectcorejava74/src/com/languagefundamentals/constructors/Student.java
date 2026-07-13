package com.languagefundamentals.constructors;

public class Student {

	int sid;
	String sname;

//	No arg constructor 
	Student() {
		System.out.println("No args constructor called ");
	}

//	Parameterized constructor
	Student(int sid, String sname) {
		System.out.println("Parameterized constructor called !!");
		this.sid = sid;
		this.sname = sname;
	}

	public static void main(String[] args) {

//		When the program, does not contain any constructor then only 
//		Java compiler will create default constructor..? 
//		The below Object is Created with the help of default constructor.
		Student s1 = new Student();
		s1.show();

		Student s2 = new Student();
		s2.sid = 101;
		s2.sname = "Srikanth";
		s2.show();

		Student s3 = new Student(103, "Abhishek");
		s3.show();

	}

	void show() {
		System.out.println(sid);
		System.out.println(sname);
	}
}
