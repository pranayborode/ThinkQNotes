package com.threadSubtopics;

//7.	WAP to show use of sleep method
public class Q7SleepMethodExample extends Thread {
	
	public void run() {
		
		for(int i = 1; i<=5; i++) {
		System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		}
		System.out.println(Thread.currentThread().getName() + " has finishes");
	}
	

	public static void main(String[] args) {
		
		Q7SleepMethodExample t1 = new Q7SleepMethodExample();
		Q7SleepMethodExample t2 = new Q7SleepMethodExample();
		Q7SleepMethodExample t3 = new Q7SleepMethodExample();
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
