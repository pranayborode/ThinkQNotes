package com.lab16CW;

import java.util.ArrayList;
import java.util.List;
///*Write a Java programming to create a banking system with three classes 

//- Bank, Account, SavingsAccount, and CurrentAccount. The bank should have 
//a list of accounts and methods for adding them. Accounts should be an 
//interface with methods to deposit, withdraw, calculate interest, 
//and view balances. SavingsAccount and CurrentAccount should implement 
//the Account interface and have their own unique methods.*/

interface Account {
	void deposit(double amount);

	void withdraw(double amount);

	void calculateInterest();

	double getBalance();
}

class SavingAccount implements Account {

	private double balance;
	private double interestRate;

	public SavingAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {

		balance += amount;

	}

	@Override
	public void withdraw(double amount) {

		if (balance - amount >= 0) {
			balance += amount;
			System.out.println("Withdraw Successfully... Your Balance is "+balance);
		} else {
			System.out.println("Insufficient Balance... Your Balance is " + balance);
		}

	}

	@Override
	public void calculateInterest() {
		balance += balance * interestRate / 100;
		System.out.println("Interest :"+balance);
	}

	
	@Override
	public double getBalance() {
		return balance;

	}

	public double getInterestRate() {
		return interestRate;
	}

}

class CurrentAccount implements Account {

	private double balance;
	private double interestRate;
	private double overdraftLimit;

	public CurrentAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		
	}

	@Override
	public void deposit(double amount) {
		balance += amount;

	}

	@Override
	public void withdraw(double amount) {
		if (balance - overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdraw Successfully... Your Balance is "+balance);
		} else {
			System.out.println("Insufficient Balance... Your Balance is " + balance);
		}

	}

	@Override
	public void calculateInterest() {
		balance += balance * interestRate / 100;
		System.out.println(balance);
		System.out.println("Interest :"+balance);
	}

	@Override
	public double getBalance() {
		return balance;
	}
	

	public double getInterestRate() {
		return interestRate;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

}


public class BankMainClass {

	public static void main(String[] args) {
		
		SavingAccount sa1 = new SavingAccount(10000.0, 1.5);
		System.out.println("Saving Account Balance : "+sa1.getBalance() + ", InterestRate : "+sa1.getInterestRate());

		sa1.deposit(10000.0);
		System.out.println("Deposite Successfully.. Your Balance is : "+sa1.getBalance());
		
		sa1.calculateInterest();
		
		sa1.withdraw(2000);
		
		CurrentAccount ca1 =new CurrentAccount(50000, 2.5);
		
		ca1.deposit(10000);
		System.out.println("Deposite Successfully.. Your Balance is : "+ca1.getBalance());
		
		ca1.calculateInterest();
		
		ca1.setOverdraftLimit(10000);
		ca1.withdraw(51000);
	}

}
