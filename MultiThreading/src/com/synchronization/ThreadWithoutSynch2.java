package com.synchronization;

class Table1 {

	public void printTable(int n) {

		System.out.println(Thread.currentThread().getName() + " has started");

		synchronized (this) {
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

		System.out.println(Thread.currentThread().getName() + " has finished");
	}
}

public class ThreadWithoutSynch2 {

	public static void main(String[] args) {

		Table1 obj = new Table1();
		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(2);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};
		t1.start();
		t2.start();

	}

}
