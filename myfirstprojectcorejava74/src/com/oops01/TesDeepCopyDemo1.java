package com.oops01;

class Student1 {

	int sid;
	String sname;
	Address1 address1;

	public Student1(int sid, String sname, Address1 address1) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address1 = address1;
	}

	public Student1(Student1 st1) {
		this.sid = st1.sid;
		this.sname = st1.sname;
		this.address1 = new Address1(st1.address1);// **********

	}

}

class Address1 {

	String city;

	public Address1(Address1 a1) {
		this.city = a1.city;
	}

	public Address1(String city) {
		super();
		this.city = city;
	}

}

public class TesDeepCopyDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Address1 address1 = new Address1("Guntur");
		Student1 st1 = new Student1(100, "Vinod", address1);
		System.out.println(st1.sid);
		System.out.println(st1.sname);
		System.out.println(st1.address1.city);
		System.out.println("-----------------------------------");

		Student1 st2 = new Student1(st1);
		System.out.println(st2.sid);
		System.out.println(st2.sname);
		System.out.println(st2.address1.city);
		System.out.println("-----------------------------------");

		st2.sid = 102;
		st2.sname = "Vinu";
		st2.address1.city = "Vijayawada";
		System.out.println("-------------------------");

		System.out.println("***********************************");
		System.out.println(st1.sid);// 100
		System.out.println(st1.sname);// vinod
		System.out.println(st1.address1.city);// Guntur

		System.out.println(st2.sid);// 102
		System.out.println(st2.sname);// Vinu
		System.out.println(st2.address1.city);// Vijayawada
	}
}
