package com.oops01.inheritance;

import java.io.IOException;

public class PersonalLoan extends LoanImpl {

	void getPersonlLoanDocInfo() {
		System.out.println("All the Personal Loan documents Verfiied Successfully !!");
	}

//	Rule 1: Method Signature must be same.
//	Method signature = Method name + parameters but not return type.

//	Rule 2: Method return type must be same until 1.4 version.
//	But, from 1.5 onwards Java introduced Co-varient return types.

//	Note : Even after 1.5 version, 
//	If the Parent class method return type is Primitive data type 
//	then the child class method must be same primitive data type.
//	So co-varient type only applicable for Object Data Types but not Primitive data types.

//	Co-varient return type means ..? 
//	If the Parent class method return type is Object data Type
//	the child class method can return the same object data type or it's sub type.

//	Ex: If Parent ------------> Number -----> C --------> Number or its sub types like Integer, Double
//		If Parent ------------> Double ------> Child ---------> Double 
//	    If Parent ------------> Object -------> Child --------> Object or String or any class 
//	    If Parent ------------> String -------> Child --------> String 

//	Rule 3: Method scope should not reduced.
//	CE : Cannot reduce the visibility of the inherited method from LoanImpl
//	private < <default> < protected < public 
//	If Parent ------------> public ---------> Child -----------> public 
//	If Parent ------------> protected ---------> Child -----------> protected or public  
//	If Parent ------------> default ---------> Child ----------->default or protected or public  
//	If Parent ------------> private ---------> we cannot access outside of the classes.

//	Rule 4: private methods we can not override.
//	Because, the scope of private is within the class, we can not access outside of the class.
//	But, If we write the same method as parent in the child class without @Override annotation 
//	it works without any error but if we use @Override annotation, we will get CE.
//CE : The method hello() of type PersonalLoan must override or implement a supertype method

//	Rule 5 : static methods we cannot override.
//	Because, static methods are loading whenever the class loads and inheritance 
//	& MOR is depending on Objects or Runtime polymorphism.
//	If we use @Override for static methods, we will get CE .
//	The method hello() of type PersonalLoan must override or implement a supertype method
//  Writing the same static method from parent to child will consider as Method hiding.

//	Rule 6 : final methods we cannot override.
//	final is a keyword we can use for methods, when we use final for a method, 
//	we cannot override those methods from Parent to child classes.
//	Note : If a class is final, all methods from that class is also final.But
//	       If a class is final, all variables from that class is not final.

//	Rule 7 : Exception handling related 
//	If the Parent class method throws any Exceptions then child class method no need to throws any of the exception.
//	but, If the child class method throws any Exception then the parent class method must throws the Same Exception or it's Parent exception. 
//	
//	Rule 8 : If the Parent class or interface is abstract and it contains abstract methods 
//	then the child class must implement abstract methods.
//	And then, If the class contains normal methods, 
//	then the child abstract class can override normal method to abstract methods.

	public void hello() throws IOException {
		System.out.println("Hello Loan IMPl ");
	}

	@Override
	public Double getLoanROI() {
		return 9.5;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome to Vcube Personal Loan Banking !!");

//		Scenario 1: By using Child Object & Child reference 
//		we can access "both Parent and child class Functionalities."
		PersonalLoan pl = new PersonalLoan();

//		Scenario 2: By using Parent Object & parent reference 
//		we can access "only Parent class functionalities." 
		LoanImpl li = new LoanImpl();

//		Scenario 3: By using Child Object & Parent reference 
//		We can access Only Parent class functionalities but, 
//		if the child class Override the functionalities from Parent then
//		we can access or it executes child class Override functionalities but not from the parent.
//		this process will consider as Dynamic Method Dispatching or Up-casting.
		LoanImpl li1 = new PersonalLoan();
//		li1.hello();

//		Scenario 4: By using Parent Object & Child Reference 
//		we can access ..? CE 
//		Type mismatch: cannot convert from LoanImpl to PersonalLoan
//		If we want to create an Object and store, LHS side must be Loan interface or Object class
//		Down-casting is not possible in java directly but namesake it is possible with the help of Explicit Type casting.
//		Why namesake ..? If we run the program, we will get Runtime Exception Saying that 
//		ClssCastException 
//		(class com.oops01.inheritance.LoanImpl cannot be cast to 
//		class com.oops01.inheritance.PersonalLoan)
		PersonalLoan pl1 = (PersonalLoan) new LoanImpl();

		double salary = pl.getCustomerSalary();
		int age = pl.getcustomerAge();
		int cibil = pl.getCibilScore();

		if (salary >= 900000.00 && age >= 26 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Basic information is validated check personal details");
			if (pl.isPhoneValid() && pl.isAadharValid() && pl.isPanValid()) {
				System.out.println("Details are good and Loan got approved !!");
				System.out.println("Your Loan ROI is : " + pl.getLoanROI());
				pl.getPersonlLoanDocInfo();
			} else {
				System.err.println("Something went wrong ! ");
			}

		} else {
			System.err.println("You are not eleigible for Personal Loan and you loan got rejected ");
		}

		System.out.println("main method ended ");
	}
}
