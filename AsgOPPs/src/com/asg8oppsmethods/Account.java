package com.asg8oppsmethods;

import java.util.Scanner;


//6) Create a class Account containing following methods :
//insert() to insert account data
//display() to display account information
//deposit() to deposit amount
//withdraw() to withdraw amount
//checkbalance() to check balance
//e.g.
//class Account{
//int acc_no;
//String name;
//float amount;
//}

public class Account {

	private int acNo;
	private String name;
	private float balance;

	Scanner sc = new Scanner(System.in);

	public void insert() {

		System.out.print("Enter Account Number: ");
		acNo = sc.nextInt();

		System.out.print("Enter Name: ");
		name = sc.next();

		System.out.print("Enter Initial Balance: ");
		balance = sc.nextFloat();

		System.out.println("Account created successfully!");

	}

	public void display() {
		System.out.println("Account Information:");
		System.out.println("Account Number: " + acNo);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}

	public void deposit() {
		System.out.print("Enter the amount to deposit: ");
		float depAmt = sc.nextFloat();

		balance = balance + depAmt;

		System.out.println("Amount deposited successfully!");
	}

	public void withdraw() {
		System.out.print("Enter the amount to withdraw: ");
		float withdrawAmt = sc.nextFloat();

		if (withdrawAmt <= balance) {
			balance = balance - withdrawAmt;
			System.out.println("Amount withdrawn successfully!");
		} else {
			System.out.println("Insufficient funds! Withdrawal failed.");
		}
	}
	
	public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

	public static void main(String[] args) {

		Account ac = new Account();
		
		ac.insert();
		ac.display();
		ac.deposit();
		ac.withdraw();
		ac.checkBalance();

	}

}
