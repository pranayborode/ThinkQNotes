package com.threadSubtopics;

//25.	What is deadlock. Show one example of deadlock.

class FullTest{
	
	//public synchronized void javaTest(FullTest t) {
	public synchronized void javaTest() {
			System.out.println(Thread.currentThread().getName()+" has started Java test");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public synchronized void sqlTest() {
		
	}
	
}


public class DeadLockExample {

	public static void main(String[] args) {
		

	}

}
