package com.threadSubtopics;

//15.	Show one example of synchronized block.

class Message {
	
	public void processMessage(String msg) {
		
		System.out.println("Sending: "+msg);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Received: "+msg);
		
	}
}

public class SynchronizedBlockExample {

	public static void main(String[] args) {
		
		Message m = new Message();
		
		Thread t1 = new Thread() {
			
			public void run() {
				
				System.out.println(Thread.currentThread().getName());
				System.out.println("------------------------------");
				
				
				
				
			}
		};

	}

}
