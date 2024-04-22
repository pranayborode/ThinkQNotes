package com.lab15;

abstract class Bank {

	abstract void getBalance();
}

class BankA extends Bank {

	int depAmt = 100;

	void getBalance() {
		System.out.println("BankA Balance : " + depAmt);
	}
}

class BankB extends Bank {
	int depAmt = 150;

	void getBalance() {
		System.out.println("BankB Balance : " + depAmt);
	}

}

class BankC extends Bank {
	int depAmt = 200;

	void getBalance() {
		System.out.println("BankC Balance : " + depAmt);
	}

}

public class BankMainDemo {

	public static void main(String[] args) {

		BankA ba = new BankA();
		ba.getBalance();

		BankB bb = new BankB();
		bb.getBalance();

		BankC bc = new BankC();
		bc.getBalance();

	}

}
