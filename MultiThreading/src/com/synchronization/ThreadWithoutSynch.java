package com.synchronization;

class Table {

	public synchronized void printTable(int n) {

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

public class ThreadWithoutSynch {

	public static void main(String[] args) {

		Table obj = new Table();
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
