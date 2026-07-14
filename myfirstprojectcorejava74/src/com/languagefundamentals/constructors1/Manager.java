package com.languagefundamentals.constructors1;

//Parent Class
class Employee {

	int empId;
	String empName;
	double salary;

	Employee() {
		System.out.println("Employee No Argument Constructor");
	}

	Employee(int empId, String empName, double salary) {
		System.out.println("Employee Parameterized Constructor");
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	void displayEmployee() {
		System.out.println("------------------------");
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Salary : " + salary);
	}
}

//Child Class
public class Manager extends Employee {

	String department;

	Manager() {
		System.out.println("Manager No Argument Constructor");
	}

	Manager(int empId, String empName, double salary, String department) {
		super(empId, empName, salary);
		System.out.println("Manager Parameterized Constructor");
		this.department = department;
	}

	void displayManager() {
		displayEmployee();
		System.out.println("Department : " + department);
	}

	public static void main(String[] args) {
		System.out.println("main method strated from Manager ");
		Manager m = new Manager(101, "Rahul", 65000, "IT");
		m.displayManager();
	}
}
