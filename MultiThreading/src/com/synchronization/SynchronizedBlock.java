package com.synchronization;

class Message {
	public void processMsg(String msg) {
		System.out.println("Sending : " + msg);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Received : " + msg);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		Message m = new Message();
		Thread t1 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("-------");

				synchronized (m) {
					System.out.println("Welcome : " + Thread.currentThread().getName());
					m.processMsg("pay the fees");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("-------");

				synchronized (m) {
					System.out.println("Welcome : " + Thread.currentThread().getName());
					m.processMsg("welcome to fest");
				}
			}
		};
		t1.setName("Pranay");
		t2.setName("Gaurav");
		t1.start();
		t2.start();
	}

}
