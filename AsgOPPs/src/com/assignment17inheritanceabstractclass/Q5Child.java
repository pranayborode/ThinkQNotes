package com.assignment17inheritanceabstractclass;

// 5)

//WAJP2 create an abstract class Parent. Add an abstract method cook() in it 
//which has only definition and one method wash() which also has 
//implementation. Create class Child which extends Parent and add the missing 
//method implementation. In main, use both the methods by creating instance 
//of the concrete class.

//6. Show use of parameterized constructor of parent class (Child class invokes 
//parent’s parameterized constructor) using super

abstract class Parent {

	private String name;
	
	public Parent(String name) {
		super();
		this.name = name;
		System.out.println("Parent Constructor");
	}

	abstract void cook();

	void wash() {
		System.out.println("Wash method in Parent Class");
	}
}

public class Q5Child extends Parent {

	
	public Q5Child(String name) {
		super(name);
		System.out.println("Child Constructor");
	}

	@Override
	void cook() {
		System.out.println("Cook method implementation in Child Class");

	}

	public static void main(String[] args) {

		//Q5Child child = new Q5Child();  //The constructor Q5Child() is undefined
		Q5Child child = new Q5Child("Pranay");

		child.wash();
		child.cook();

	}

}
