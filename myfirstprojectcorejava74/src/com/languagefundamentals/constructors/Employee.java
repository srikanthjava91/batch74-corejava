package com.languagefundamentals.constructors;

public class Employee {

	int eid;
	String ename;
	double salary;
	long phone;

	// No arg Constructor
	Employee() {
		System.out.println("No arg constructor called !");
		eid = 100;
		ename = "Unknown";
		salary = 1000;
		phone = 0;
	}

//	 Yes if your arguments are different variables, we can store without this keyword also.
//	Then, Why we need this, Because for providing Better readability and to avoid Ambiguity problems in applications.
//	ex: If I have 100 arguments in my constructors, we don't know which argument is storing in which variable)
	Employee(int eid, String ename, double salary, long phone) {
//		The assignment to variable eid has no effect
		System.out.println("Parameterized constructor called ");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.phone = phone;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
//		The Below Object is Created with the help of default constructor 
		Employee emp1 = new Employee();
		emp1.show();
//
		Employee emp2 = new Employee();
		emp2.show();

		Employee emp3 = new Employee(22, "Srikanth", 20000.00, 9988776655L);
		emp3.show();
	}

	void show() {
		System.out.println("********Employee Info **************");
		System.out.println("Employee ID : " + eid);
		System.out.println("EMployee Name  : " + ename);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee Phone : " + phone);
		System.out.println("************************************");
	}

}
