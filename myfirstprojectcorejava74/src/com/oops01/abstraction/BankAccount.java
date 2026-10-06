package com.oops01.abstraction;

public interface BankAccount {

	public abstract void deposite(double amount);

	public abstract void withdraw(double amount);

	void checkBalance();

	void loanInfo();

	void loanROI();

}
