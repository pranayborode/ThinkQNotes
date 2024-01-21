package com.cooperation;

class Account {
	int balance = 2000;

	public synchronized void withdraw(int amount) {

		System.out.println("-----------------------------------------");
		System.out.println(Thread.currentThread().getName() + " wants to withdraw " + amount);

		if ((balance - amount) < 0) {
			System.out.println("-----------------------------------------");
			System.out.println("Insufficient balance: " + balance);
			System.out.println(Thread.currentThread().getName() + " is waiting for deposit");

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			withdraw(amount);
		} else {
			balance = balance - amount;
			System.out.println("-----------------------------------------");
			System.out.println(Thread.currentThread().getName() + "has withdraw " + amount);
			System.out.println("Balance: " + balance);
			System.out.println("-----------------------------------------");

		}
	}

	public synchronized void deposit(int amount) {

		balance += amount;
		System.out.println("-----------------------------------------");
		System.out.println(Thread.currentThread().getName() + "has deposited " + amount);
		System.out.println("Balance: " + balance);
		System.out.println("-----------------------------------------");
		notifyAll();

	}
}

public class AccountIrnterThread {

	public static void main(String[] args) {

		Account a1 = new Account();

		Thread son = new Thread() {

			public void run() {
				a1.withdraw(2500);
			}
		};
		son.setName("Son");

		Thread daughter = new Thread() {

			public void run() {
				a1.withdraw(3000);
			}
		};
		daughter.setName("Daughter");

		Thread father = new Thread() {

			public void run() {

				try {
					Thread.sleep(12000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				a1.deposit(2000);
			}
		};
		father.setName("Father");

		Thread mother = new Thread() {

			public void run() {

				try {
					Thread.sleep(12000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				a1.deposit(4000);
			}
		};
		mother.setName("Mother");

		son.start();
		daughter.start();
		father.start();
		mother.start();
	}

}
