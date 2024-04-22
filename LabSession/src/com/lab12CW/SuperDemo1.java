package com.lab12CW;

class Parent {

	int value = 10;

	

	public void display() {

		System.out.println("In paretn Class mehtod");
		System.out.println("Parent class value : " + value);
	}

}

class Child extends Parent {

	int value = 20;

	public void display() {

		System.out.println("In Child Class mehtod");

		System.out.println("Child class value " + value);

		System.out.println("Parent class value " + super.value);

	}

	void show() {
		//display();
		super.display();
	}

}

public class SuperDemo1 {

	public static void main(String[] args) {

		Child c1 = new Child();
		c1.display();
		c1.show();
		
	}

}
