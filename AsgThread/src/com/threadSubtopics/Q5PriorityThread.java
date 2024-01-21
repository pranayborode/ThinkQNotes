package com.threadSubtopics;


//5.	Change priorities of thread. Check what are values for MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY.

//6.	What is default priority of a thread.
//      Ans => 5
public class Q5PriorityThread extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		Q5PriorityThread t1 = new Q5PriorityThread();
		Q5PriorityThread t2 = new Q5PriorityThread();
		Q5PriorityThread t3 = new Q5PriorityThread();
		
		t1.start();
		t1.setPriority(MIN_PRIORITY);
		
		t2.start();
		t2.setPriority(5);
		
		t3.start();
		t3.setPriority(MAX_PRIORITY);
		

	}

}
