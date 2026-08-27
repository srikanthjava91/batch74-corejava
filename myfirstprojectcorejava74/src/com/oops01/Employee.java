package com.oops01;

//DTO 	: Data Transfer Object 
//POJO 	: plain Old Java Object
//Model : Data Model
public class Employee {

	// private data
	private int eid;
	private String ename;
	private double salary;

	// toString() method
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	// no-arg constructor
	public Employee() {
	}

	// Parameterized constructor
	public Employee(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	// setters & getter methods
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
