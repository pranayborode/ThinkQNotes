package com.lambda2;

public class ThreadLambda {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Runnable r2 = ()->System.out.println(Thread.currentThread().getName());

		Thread t = new Thread(r2);
		
		t.start();
		
		Runnable r3 =()->{
			
			for(int i= 1; i<=5; i++) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
			}
		};
		
		t = new Thread(r3);
		t.start();
	}

}
