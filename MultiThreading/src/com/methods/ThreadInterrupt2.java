package com.methods;

public class ThreadInterrupt2 implements Runnable{

	@Override
	public void run() {
		
		for(int i= 1; i<=5; i++) {
			
			System.out.println(Thread.currentThread().getName()+" : "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		ThreadInterrupt2 t1 = new ThreadInterrupt2();
		
		Thread t;
		
		t = new Thread(t1,"MyThread");
		t.start();
	    t.interrupt();

	}
}
