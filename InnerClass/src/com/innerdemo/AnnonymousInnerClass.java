package com.innerdemo;

interface Doable {
	public void doIt();
}

class Car {
	public void drive() {
		System.out.println("I am driving a car");
	}

}

abstract class Cake {

	abstract void doBaking();

}

public class AnnonymousInnerClass {

	public static void main(String[] args) {

		// using interface

		Doable d1 = new Doable() {

			@Override
			public void doIt() {
				System.out.println("I am attending classes");

			}
		};
		d1.doIt();

		Car c1 = new Car() {
			public void drive() {
				System.out.println("I am driving Audi");
			}

		};
		
		c1.drive();
		
		Cake ck = new Cake() {
			
			@Override
			void doBaking() {
				System.out.println("I am baking chocolate cake");
				
			}
		};
		ck.doBaking();

	}

}
