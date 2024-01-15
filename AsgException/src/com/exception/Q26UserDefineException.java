package com.exception;



//26. WAP to create user defined Exception and catch the exception. 

class Account {

	private int acid;
	private String name;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int acid, String name, double balance) {
		super();
		this.acid = acid;
		this.name = name;
		this.balance = balance;
	}

	public int getAcid() {
		return acid;
	}

	public void setAcid(int acid) {
		this.acid = acid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit(double amount) {

		balance += amount;
		System.out.println("Amount deposite: " + amount);
		System.out.println("New balance    : " + balance);
	}

	void withdraw(double amount) {

		try {

			if ((this.balance - amount) < 0)
				throw new InSuffBalanceException("Your balance is low : " + balance);

			balance -= amount;
			System.out.println("Amount withdraw: " + amount);
			System.out.println("New Balance    : " + balance);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return "Account [acid=" + acid + ", name=" + name + ", balance=" + balance + "]";
	}

}
public class Q26UserDefineException {

	public static void main(String[] args) {
		Account ac = new Account(101, "Nakul", 3000);

		ac.deposit(1000);
		ac.withdraw(5000);
		System.out.println("-------------------");
		ac.deposit(2000);
		ac.withdraw(5000);

	}

}
