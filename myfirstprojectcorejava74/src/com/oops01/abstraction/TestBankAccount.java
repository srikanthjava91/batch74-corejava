package com.oops01.abstraction;

public class TestBankAccount {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Saving bank Account : ");

//		Cannot instantiate the type BankAccount (interface)
//		BankAccount ba = new BankAccount();

//		Cannot instantiate the type BankAccountAbs (abstract class)
//		BankAccountAbs babs = new BankAccountAbs();

		BankAccountAbs sa = new SavingsAccount();
		sa.deposite(20000.00);
		sa.withdraw(15000);
		
//		We can call Parent class functionalities 
//		By using Child Object with parent reference is the process of Upcasting
		sa.welcome(); 

	}

}
