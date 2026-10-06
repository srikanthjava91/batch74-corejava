package com.oops01.abstraction;

//Even though the abstract class does not contain any abstract methods we can keep class as abstract
//but, If a normal class contains abstract method the class must be abstract.

public abstract class BankAccountAbs implements BankAccount {

	// instance variable
	int a = 10;

	// static variable
	static String name = "Vcube";

	// constructor
	BankAccountAbs() {
		System.out.println("no args constructor called ");
	}

	// concrete method
	void welcome() {
		System.out.println("Welcome to Vcube Banking !");
	}

	// abstract method from abstract class
	abstract void hello();

	// Override method from interface
	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loanInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loanROI() {
		// TODO Auto-generated method stub

	}

}
