package com.oops01;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		System.out.println("Employee Info ");

		Employee emp1 = new Employee();
		
		emp1.setEid(18);
		emp1.setEname("Virat");
		emp1.setSalary(8756468.00);

		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getSalary());
		
		

//      Note : if the data is private, we cannot access outside of the classes.
//		Accessing the data Outside of class 
//		emp1.eid = 18;
//		emp1.ename = "Virat";
//		emp1.salary = 1800000.00;
//
//		System.out.println(emp1.eid);// 0 --> 18
//		System.out.println(emp1.ename);// null --> Virat
//		System.out.println(emp1.salary);// 0.0 --> 1800000.00

	}
}
