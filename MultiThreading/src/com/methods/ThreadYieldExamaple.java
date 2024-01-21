package com.methods;

public class ThreadYieldExamaple {

	public static void main(String[] args) {
		Thread t1 = new Thread() {

			public void run() {

				for (int i = 0; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					Thread.yield();
				}
			}
		};

		Thread t2 = new Thread() {

			public void run() {

				for (int i = 0; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
				}
			}
		};

		t1.start();
		t2.start();
	}

}
