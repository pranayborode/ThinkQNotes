package com.synchronization;

class MyTable {

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

class Thread1 extends Thread {

	MyTable t;

	public Thread1(MyTable t) {
		this.t = t;
	}

	public void run() {
		t.printTable(2);
	}

}

class Thread2 extends Thread {

	MyTable t;

	public Thread2(MyTable t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

public class ThreadSynch {

	public static void main(String[] args) {

		MyTable obj = new MyTable();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);

		t1.start();
		t2.start();

	}

}
