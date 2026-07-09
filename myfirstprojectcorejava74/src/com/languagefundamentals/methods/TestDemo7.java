package com.languagefundamentals.methods;

class Student2 {

	int sid;
	String sname;
	long phone;
	int age;
	String city;
	String street;
	String state;

}

public class TestDemo7 {

	void getStudentInfo(Student2 s) {

		System.out.println("Student ID : " + s.sid);
		System.out.println("Student Name : " + s.sname);
		System.out.println("Student Age : " + s.age);
		System.out.println("Student Phone : " + s.phone);
		System.out.println("Student City : " + s.city);
		System.out.println("Student Street : " + s.street);
		System.out.println("Student State : " + s.state);

	}

	public static void main(String[] args) {
		TestDemo7 t = new TestDemo7();

		Student2 s = new Student2();

		s.sid = 101;
		s.sname = "Srikanth";
		s.age = 21;
		s.state = "TG";
		s.street = "KPHB";
		s.city = "Hyd";
		s.phone = 9999999999L;

		t.getStudentInfo(s);
		
//		Employee e = getEmployee();
//		System.out.println(e.eid);
		

	}

}
