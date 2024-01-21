package com.factory;

class Factory {
	int qty = 10;

	public synchronized void consume(int q) {

		System.out.println("-----------------------------------");
		System.out.println(Thread.currentThread().getName() + " want to consume " + q);

		if ((qty - q) < 0) {

			System.out.println("-----------------------------------");
			System.out.println("Out of Stock: " + qty);
			System.out.println(Thread.currentThread().getName() + " is waiting");

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			consume(q);

		} else {
			qty = qty - q;
			System.out.println("-----------------------------------------");
			System.out.println(Thread.currentThread().getName() + " has consume");
			System.out.println("Quantity: " + qty);
			System.out.println("-----------------------------------------");
		}

	}

	public synchronized void produce(int q) {
		qty += q;
		System.out.println("-----------------------------------------");
		System.out.println(Thread.currentThread().getName() + " has produce " + q);
		System.out.println("Balance: " + qty);
		System.out.println("-----------------------------------------");
		notifyAll();

	}

}

public class FactoryItntreThread {

	public static void main(String[] args) {

		Factory f = new Factory();

		Thread customer1 = new Thread() {

			public void run() {
				f.consume(15);
			}
		};
		customer1.setName("Customer1");

		Thread customer2 = new Thread() {

			public void run() {
				f.consume(8);
			}
		};
		customer2.setName("Customer2");

		Thread producer1 = new Thread() {

			public void run() {
				
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				f.produce(5);
			}
		};
		producer1.setName("Producer1");

		Thread producer2 = new Thread() {

			public void run() {
				
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				f.produce(8);
			}
		};
		producer2.setName("Producer2");

		
		customer1.start();
		customer2.start();
		producer1.start();
		producer2.start();
	}

}
