package com.asg11staticfinal;

//4)You need to create a secret bank account for the President of the nation. 
//The bank allows his/her account to be accessed by other family members. 
//The bank account should have a method which allows you to add a specified 
//amount of money to the account. Make sure that you make the method in such a manner 
//that the method can be accessed by only the President while keeping 
//rest of the account visible to the family members.


public class A4SecretBankAccount {

	private String presidentName;
	private double balance;

	public A4SecretBankAccount(String presidentName, double initialBalance) {
		this.presidentName = presidentName;
		this.balance = initialBalance;
	}

	private void addMoney(double amount) {
		if ("PresidentName".equals(presidentName)) {
			balance += amount;
			System.out.println("Amount added successfully. New balance : " + balance);
		} else {
			System.out.println("Only the President can add money.");
		}
	}

	public void withdraw(double amount) {
		if ((balance - amount) > 0) {
			balance -= amount;
			System.out.println("Withdrawal successful. Remaining balance: " + balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
		}
	}
	public static void main(String[] args) {
		
		A4SecretBankAccount presidentAccount = new A4SecretBankAccount("PresidentName", 100000);
		presidentAccount.addMoney(5000);
		
		System.out.println("-------------------------------------------------");
		
		A4SecretBankAccount presidentWife = new A4SecretBankAccount("PresidentWife", 100000);

		presidentWife.addMoney(2000);
		presidentWife.withdraw(50000);
	}

}
