package com.basics;

public class ThreadSleepDemo2 extends Thread {

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			public void run() {

				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
				System.out.println(Thread.currentThread().getName() + " has finishes");

			}
		};

		Thread t2 = new Thread() {

			public void run() {

				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
				System.out.println(Thread.currentThread().getName() + " has finishes");

			}
		};
		
		t1.start();
		t2.start();
	}

}
