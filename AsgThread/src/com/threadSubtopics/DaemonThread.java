package com.threadSubtopics;

//4.Create a daemon thread. Show in example that jvm shuts down even if daemon thread is running.

public class DaemonThread extends Thread {

	public DaemonThread(String name) {
		super(name);
	}

	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon Thread");
		} else {
			System.out.println(getName() + " is User thread");
		}
	}

	public static void main(String[] args) {

		DaemonThread t1 = new DaemonThread("t1");
		DaemonThread t2 = new DaemonThread("t2");
		DaemonThread t3 = new DaemonThread("t3");
		
		t1.setDaemon(true);
		t1.start();
		
		t2.start();
		
		t3.setDaemon(true);
		t3.start();

	}

}
