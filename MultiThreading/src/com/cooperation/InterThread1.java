package com.cooperation;

class SharedS {

	public synchronized void mehtodOne() {

		System.out.println(Thread.currentThread().getName() + " has locked method one");

		System.out.println(Thread.currentThread().getName() + " has released method one");

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " has finished task");
	}

	public synchronized void methodTwo() {

		notify(); // waked up one thread
		// notifyAll(); //wakes up all the thread

		System.out.println(Thread.currentThread().getName() + " has notified");
	}
}

public class InterThread1 {

	public static void main(String[] args) {

		SharedS obj = new SharedS();

		Thread t1 = new Thread() {
			public void run() {

				obj.mehtodOne();
			}
		};

		Thread t2 = new Thread() {
			public void run() {

				try {
					Thread.sleep(1200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj.methodTwo();
			}
		};

		Thread t3 = new Thread() {
			public void run() {

				obj.mehtodOne();
			}
		};

		t1.start();
		t2.start();
		t3.start();

	}

}
