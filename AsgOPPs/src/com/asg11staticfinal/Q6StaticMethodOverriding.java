package com.asg11staticfinal;

//6.	See if you can override static method.

class MethodOverridingParent{
	static void displayMessage() {
		System.out.println("Static Method in Parent Class");
	}
}

public class Q6StaticMethodOverriding extends MethodOverridingParent {
	
	static void displayMessage() {
		System.out.println("Static Method in Child Class");
	}

	
	
	public static void main(String[] args) {
		
		displayMessage();
		
		
	}

}
