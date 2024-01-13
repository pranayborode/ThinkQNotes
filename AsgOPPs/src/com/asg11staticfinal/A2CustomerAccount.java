package com.asg11staticfinal;

public class A2CustomerAccount {

	private double balance;

	public A2CustomerAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void withdraw(double amount) {
		if ((balance - amount) > 0) {
			balance -= amount;
			System.out.println("Withdrawal successful. Remaining balance: " + balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
		}
	}

	public void debitCardPayment(double amount) {
		double debitCardCharges = 1.5;
		balance -= debitCardCharges;

		System.out.println("DebitCard charges is " + debitCardCharges);
		this.withdraw(amount);

	}
	
	public void netBankingTransaction(double amount) {
		double netBankingCharges = 2.0;
		balance -= netBankingCharges;

		System.out.println("NetBanking Transaction charges is " + netBankingCharges);
		this.withdraw(amount);

	}

	public static void main(String[] args) {
		A2CustomerAccount ca1 = new A2CustomerAccount(1000);

		//ca1.debitCardPayment(100);
		ca1.netBankingTransaction(1002);

	}

}
