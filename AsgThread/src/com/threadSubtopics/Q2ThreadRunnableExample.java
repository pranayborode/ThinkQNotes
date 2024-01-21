package com.threadSubtopics;

//2.	Create thread by implementing runnable interface.

public class Q2ThreadRunnableExample implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		Q2ThreadRunnableExample r1 = new Q2ThreadRunnableExample();
		Q2ThreadRunnableExample r2 = new Q2ThreadRunnableExample();
		Q2ThreadRunnableExample r3 = new Q2ThreadRunnableExample();

		Thread t;
		t = new Thread(r1);
		t.start();

		t = new Thread(r2);
		t.start();

		t = new Thread(r3);
		t.start();

	}

}
