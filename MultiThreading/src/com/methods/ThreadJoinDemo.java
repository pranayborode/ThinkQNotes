package com.methods;

public class ThreadJoinDemo  extends Thread {

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

	public static void main(String[] args) throws InterruptedException {
		ThreadJoinDemo t1 = new ThreadJoinDemo();
		ThreadJoinDemo t2 = new ThreadJoinDemo();
		ThreadJoinDemo t3 = new ThreadJoinDemo();
		
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");


//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
//		t3.start();//t3 waits t1 & t2 to complete
		

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		
	}


}
