package com.languagefundamentals;

import java.math.BigInteger;

class Student {
	int sage;
	String sname;
	Address address;

}

class Address {
	String city;
}

public class TestDataTypesDemo2 {

	String name = "Srikanth";
	BigInteger bi = new BigInteger("8657465589");

	public static void main(String[] args) {
		System.out.println("main method started !");

		Student s1 = new Student();
		s1.address.city = "Hyd";
		s1.sage = 22;
		s1.sname = "Suresh";

		System.out.println(s1.sage);
		System.out.println(s1.sname);

		Student s2 = new Student();
		s2.sage = 23;
		s2.sname = "Ramesh";

		System.out.println(s2.sage);
		System.out.println(s2.sname);

	}
}
