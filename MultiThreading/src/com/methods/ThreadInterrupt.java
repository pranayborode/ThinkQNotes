package com.methods;

public class ThreadInterrupt implements Runnable{

	@Override
	public void run() {
		
		for(int i= 1; i<=5; i++) {
			
			if(Thread.interrupted()) {
				System.out.println("Interrupt: "+i);
			}else {
				System.out.println("Normal: "+i);
				Thread.currentThread().interrupt();
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		ThreadInterrupt t1 = new ThreadInterrupt();
		
		Thread t;
		
		t = new Thread(t1,"MyThread");
		t.start();
	    t.interrupt();

	}
}
