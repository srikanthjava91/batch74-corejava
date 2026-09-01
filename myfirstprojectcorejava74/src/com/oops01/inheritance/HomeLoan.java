package com.oops01.inheritance;

import java.io.IOException;

//Child or Sub or Derived
public class HomeLoan extends LoanImpl {

//	Whenever we are not happy or not satisfied from parent class functionalities 
//	go and create the same method with different behavior in the child class 
//	is the concept of method overriding.

//	Rule1 : Method signature must be same. 
//	Method signature = Method name + parameters but not return type.

//	Rule2 : Method return type must be same until 1.4 version, but From 1.5 onwards 
//	introduced "Co-varient return types".
//	Note : Even after 1.5 version, if the Parent class method return type is Primitive data type
//	then the child class method must be same Primitive data type only.
//	So,Co-varient return types applicable only for Object data Types.

//	Co-varient return type means, If the Parent class method return type is 
//	any Object Data Type
//	then the child class method can return same Object data type 
//	or it's sub type will consider as Co-varient return types.

//	ex: P ----> Double -----> C ----> Double 
//	ex: P ----> Number -----> C ----> Double 
//	ex: P ----> Object ----> C ---> any object 
//	ex: P ----> String ----> C ----> String 

//	Rule 3: The scope should not reduced.
//	If the Parent class Method scope is public child class method must be public only.
//	ex: P ----> public  ----> C ---> public 
//	    P ----> protected ---> C ---> protected or public 
//	    P ----> default   ----> C ---> default or protected or public 
//		P ----> private   ----> For private method we cannot override.

//	Rule 4: Cannot Override private methods.
//	Note : private methods, we cannot override because the scope of private is within the class.
//	but if we write same method in the child class without @Override annotation is possible and 
//	it is consider like child class method only but not override method
//  

//	Rule 5 : static methods we cannot Override.
//	Because, static methods are loading whenever the class loads, 
//	but, Method overriding & inheritance is working on Object creations.
//	If we use same static method from Parent to child as Method Hiding.
//	From the Parent there may be a chance same method in child class with static 
//	still it works until we use @Override.
//	if we use @Override we will get a compile time error.

//	Rule 6: final methods, we cannot override.
//	Whenever we use final for a parent class method, we cannot override those methods.
//	as per final keyword specification, we cannot override final methods from Parent to child.

//	Note : If any class is final, all methods from that class is also final.
//		   If any class is final, all variables from that class are not final.

// Rule 7 : Exception Handling related.
//	If the Parent class method throws any Exception, child class method no need to throws any exception.
//	But If the child class method throws any Exceptions 
//	the Parent class must throws the same exception or its parent exception.
	
//	Rule 8 : abstract method must override from Parent to child class if the Parent class is abstract.
//	and the class contains normal method, 
//	the normal method can also override it into sub classes 
//	as abstract method if the child class is abstract.
	
	

	@Override
	void welcome() throws IOException{
		System.out.println("Welcome Loan IMPL ");
	}

//	private void hello() {
//		System.out.println("Hello from Home Loan");
//	}

	@Override
	public Double getLoanROI() {
		double roi = 6.5;

		int cibil = getCibilScore();

		if (cibil >= 300 && cibil <= 549) {
			System.out.println(
					" Poor – High risk; loan applications are likely to be rejected or approved at high interest rates");
			roi = roi + 4.0;
		} else if (cibil >= 550 && cibil <= 699) {
			System.out.println("Fair – Moderate risk; may face limitations in credit approval ");
			roi = roi + 2.0;
		} else if (cibil >= 700 && cibil <= 749) {
			System.out.println(" Good – Low risk; better chances of loan approval with favorable terms");
			roi = roi + 1.5;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println(
					"Excellent – Very low risk; highest likelihood of approval and access to lower interest rates");
			roi = roi + 0.5;
		} else {
			System.err.println("Invalid Cibil information !! Can you connect with  Relationship Manager of your Bank ");
			roi = roi + 10.0;
		}

		return roi;

	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome to Vcube Home Loan Banking !!");

//		Scenario 1: By using child Object & Child Reference 
//		We can access both Parent & child class functionalities.
		HomeLoan hl = new HomeLoan();

//		Scenario 2: By using Parent Object & Parent reference 
//		We can access Only parent class functionalities but not child class.
		LoanImpl l1 = new LoanImpl();

//		Scenario 3: By using child Object & Parent Reference
//		We can access Only Parent class functionalities. but, 
//		"If the child class Override Parent class methods" then 
//		l2 (parent reference) pointing to Parent methods 
//		but executing child class methods is the concept of Dynamic method dispatching.
//		Storing child Object into Parent reference will consider as Up-casting.
//		Up-casting will helpful for Abstraction.

		LoanImpl l2 = new HomeLoan();
//		l2.welcome();

//		Scenario 4: By using Parent Object & Child Reference 
//		We can access ..? CE 
//		In Java, Down-casting is not possible directly, but namesake it is possible 
//		with the help of Explicit Type-casting.
//		namesake means, we can point to Both Parent & child class functionalities but we will get
//		Runtime Exceptions saying that "ClassCastException".
//		Exception in thread "main" java.lang.ClassCastException: 
//		class com.oops01.inheritance.LoanImpl cannot be cast to 
//		class com.oops01.inheritance.HomeLoan
//		Type mismatch: cannot convert from LoanImpl to HomeLoan
		HomeLoan hl2 = (HomeLoan) new LoanImpl();

//		Loan l = new LoanImpl();//Abstraction with Upcasting  
//		Object obj = new LoanImpl();

		double salary = hl.getCustomerSalary();
		int age = hl.getcustomerAge();
		int cibil = hl.getCibilScore();

		if (salary >= 800000.00 && age >= 25 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Basic information is validated check personal details");
			if (hl.isPhoneValid() && hl.isAadharValid() && hl.isPanValid()) {
				System.out.println("Details are good and Home Loan got approved !!");
				System.out.println("Your Loan ROI is : " + hl.getLoanROI());
				hl.getHomeLoanDocInfo();
			} else {
				System.err.println("Something went wrong ! ");
			}

		} else {
			System.err.println("You are not eleigible for Home Loan and you loan got rejected ");
		}

	}

	private void getHomeLoanDocInfo() {
		System.out.println("All the Home Loan documents Verfiied Successfully !!");
	}

}
