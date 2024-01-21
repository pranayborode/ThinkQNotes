package com.synchronization;

class Table2 {

	public static synchronized void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + (n * i));

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class StaticSynchoronization {

	public static void main(String[] args) {

		Table2 obj1 = new Table2();
		Table2 obj2 = new Table2();

		Thread t1 = new Thread() {

			public void run() {
				obj1.printTable(2);
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				obj1.printTable(5);
			}
		};

		Thread t3 = new Thread() {

			public void run() {
				obj1.printTable(10);
			}
		};

		t1.start();
		t2.start();
		t3.start();

	}

}
