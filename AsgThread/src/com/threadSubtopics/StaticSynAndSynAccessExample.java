package com.threadSubtopics;

//19.	If thread t1 is accessing static synchronized method m1 , can thread t2 access synchronized method m2 at same time.
class MyTable1 {

	public static synchronized void printTable1(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + (n * i));

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyTable2 {

	public synchronized void printTable2(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + (n * i));

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class StaticSynAndSynAccessExample {

	public static void main(String[] args) {

		MyTable1 obj1 = new MyTable1();

		MyTable2 obj2 = new MyTable2();

		Thread t1 = new Thread() {

			public void run() {
				obj1.printTable1(2);
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				obj2.printTable2(5);
			}
		};
		
		t1.start();
		t2.start();
	}

}
