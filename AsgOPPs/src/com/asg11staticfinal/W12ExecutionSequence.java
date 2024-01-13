package com.asg11staticfinal;


//1.WAP which contain default constructor, parameterized constructor, 
//  one static method, one instance method, one static block and show the execution sequence.
public class W12ExecutionSequence {

	private String message;
	
	public W12ExecutionSequence() {
		
		this.message = "Default Constructor message";
		System.out.println(this.message);

	}

	public W12ExecutionSequence(String message) {
		this.message = "Parameterized Constructor message";
		System.out.println(this.message);

	}
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("Instance block");
	}
	
	public static void staticMehod() {
		System.out.println("Static method");
	}
	
	public void instanceMethod() {
		System.out.println("Instance method");
	}

	public static void main(String[] args) {

//		W12ExecutionSequence es1 = new W12ExecutionSequence();
//		staticMehod();
//		es1.instanceMethod();
		
		System.out.println("-----------------------------");
		
		W12ExecutionSequence es2 = new W12ExecutionSequence("Welcome");
		
		staticMehod();
		es2.instanceMethod();
		
	}

}
