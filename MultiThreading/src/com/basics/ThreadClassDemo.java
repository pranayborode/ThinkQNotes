package com.basics;

public class ThreadClassDemo extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
		
		System.out.println("-----------------------------------------------");
		
	}
	public static void main(String[] args) {
		
		ThreadClassDemo t1 = new ThreadClassDemo();
		ThreadClassDemo t2 = new ThreadClassDemo();
		ThreadClassDemo t3 = new ThreadClassDemo();

		t1.start();
		t1.setPriority(MIN_PRIORITY);
	
		t2.start();
//		t1.start();
		
		t3.start();
		t3.setPriority(MAX_PRIORITY);
		
//		t1.run();
//		t2.run();
//		t3.run();
	}

}
