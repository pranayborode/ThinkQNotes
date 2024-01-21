package com.basics;

public class ThreadSleepDemo extends Thread {

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

	public static void main(String[] args) {

		ThreadSleepDemo t1 = new ThreadSleepDemo();
		ThreadSleepDemo t2 = new ThreadSleepDemo();

		t1.setName("First");
		t2.setName("Second");

		t1.start();
		t2.start();
		
		
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

}
