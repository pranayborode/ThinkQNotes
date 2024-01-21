package com.threadSubtopics;


//1.	Create thread by extending Thread class.

public class Q1ThreadExtendExample  extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		
		Q1ThreadExtendExample t1 = new Q1ThreadExtendExample();
		Q1ThreadExtendExample t2 = new Q1ThreadExtendExample();
		Q1ThreadExtendExample t3 = new Q1ThreadExtendExample();
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
