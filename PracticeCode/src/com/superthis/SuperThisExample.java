package com.superthis;

class ParentClass {
	
	int i = 10;

	public ParentClass() {
		System.out.println("Default Constructor");
	}

	public ParentClass(int i) {
		this();
		System.out.println("Parameterized Constructor : " + i);
	}

	void methodOne() {
		i=20;
		System.out.println("In Method One");
		System.out.println("Local fild i:"+i);
		System.out.println("Instance fild i: "+this.i);
		
	}

	void methodTwo() {
		this.methodOne();
		System.out.println("In Method Two");
	}
}

public class SuperThisExample  extends ParentClass{
	
	int i = 20;
	
	public SuperThisExample() {
		super(10);
		System.out.println("Child Class Default Constructor");
	}
	
	void newMethodOne() {
		super.methodTwo();
	}
	
	void newMethodTwo() {
		int i = 30;
		this.newMethodOne();
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}

	public static void main(String[] args) {

		SuperThisExample obj = new SuperThisExample();
		
		obj.newMethodTwo();
	}

}
