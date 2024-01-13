package com.assignment15overriding;

//6) A bank has a principal amount and a rate of interest which is 2%. 

//A savings account has a rate of interest 3% while a current account has 5%. 
//Write a method that displays the rate of interest based on whether the account is default/ savings/ current.

class Bank {

	public void displayInterestRate() {
		System.out.println("Default Account : Interest rate - 2%");
	}
}

class SavingsAccount extends Bank {

	public void displayInterestRate() {
		System.out.println("Saving Account : Interest rate - 3%");
	}
}

class CurrentAccount extends Bank {

	public void displayInterestRate() {
		System.out.println("Current Account : Interest rate - 5%");
	}
}

public class BankExample {

	public static void main(String[] args) {
		Bank b = new Bank();
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		b.displayInterestRate();
		sa.displayInterestRate();
		ca.displayInterestRate();

	}

}
