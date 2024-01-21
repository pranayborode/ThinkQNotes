package com.threadSubtopics;

//3.	Show example in which two threads share same object.
public class Q3ShereObjectThread extends Thread{
	
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Q3ShereObjectThread t1 = new Q3ShereObjectThread();
		Q3ShereObjectThread t2 = new Q3ShereObjectThread();

		t1.start();
		t2.start();
		t1.start();
		
		
	}

}
