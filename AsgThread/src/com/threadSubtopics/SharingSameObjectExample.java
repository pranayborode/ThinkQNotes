package com.threadSubtopics;

//18.	Show use of synchronization if two threads are sharing same objects.


class Table {
	
	public synchronized void printTable(int n) {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(n+"X"+i+"="+(i*n));
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Thread1 extends Thread{
	
	Table t;
	
	public Thread1(Table t) {
		this.t= t;
	}
	
	public void run() {
		t.printTable(2);
	}
}

class Thread2 extends Thread{
	
	Table t;
	
	public Thread2(Table t) {
		this.t= t;
	}
	
	public void run() {
		t.printTable(5);
	}
}
public class SharingSameObjectExample {

	public static void main(String[] args) {
		
		Table obj = new Table();
		
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
		

	}

}
