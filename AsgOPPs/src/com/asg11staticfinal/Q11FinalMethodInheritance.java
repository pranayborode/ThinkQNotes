package com.asg11staticfinal;

//11.	WAP to check whether final method of parent can be inherited in Child class.
//12.	WAP to check whether private method of parent can be inherited in Child class.

class Parent {
	
	final void finalMethod() {
		System.out.println("Parent class FinalMethod");
	}
	
	private void privateMethod() {
		System.out.println("Parent class PrivateMethod");
	}
	
	
}

class Child extends Parent{
	
}

public class Q11FinalMethodInheritance {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.finalMethod();
		
		//c.privateMethod();  //The method privateMethod() from the type Parent is not visible
		//Private methods in a parent class cannot be directly inherited by child classes

	}

}
