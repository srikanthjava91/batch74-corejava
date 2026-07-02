package com.languagefundamentals;

//static + instance + local 
public class Employee {

	// Primitive + instance
	int id = 100;

	// Object + instance
	String name = "Unknown";

	// Primitive + static
	static int orgId = 555;
	static String orgName = "Vcube";

	public static void main(String[] args) {

//		For Accessing instance data, we must need to create Object
		Employee emp1 = new Employee();
		System.out.println(emp1.id);
		System.out.println(emp1.name);

		Employee emp2 = new Employee();
		emp2.id = 234;
		emp2.name = "Ajay";

		Employee emp3 = new Employee();

		System.out.println(emp2.id);// 234
		System.out.println(emp2.name);// Ajay

		System.out.println(emp3.id);// 100
		System.out.println(emp3.name);// unknow

		System.out.println("**********Accessing static data directly************");
		System.out.println(orgId);
		System.out.println(orgName);

		System.out.println("**********Accessing static data by using class ************");
		System.out.println(Employee.orgId);
		System.out.println(Employee.orgName);

		System.out.println("**********Accessing static data Object ref var************");
		System.out.println(emp1.orgId);
		System.out.println(emp1.orgName);

		System.out.println("------------------------");
		orgId = 666;
		orgName = "VSS";

		System.out.println(emp2.orgId);
		System.out.println(emp2.orgName);
		
		Employee emp4 = new Employee();
		System.out.println(emp4.orgId);
		System.out.println(emp4.orgName);
		
		System.out.println("------------------------");
		Employee emp5 = null;
		
		System.out.println( "before : " + emp5);
		//
		//
		emp5 = new Employee();
		
		System.out.println( "after : " + emp5);
		
		//he static field Employee.orgId should be accessed in a static way
		System.out.println(emp5.orgId);
		System.out.println(emp5.orgName);
		
//		System.out.println(emp5.id);//NPE 
		
				

	}

}
