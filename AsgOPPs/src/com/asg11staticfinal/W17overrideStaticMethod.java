package com.asg11staticfinal;

class Parent4 {

	public static void staticMethod() {

		System.out.println("Static method in parent class");
	}
}

class Child4 extends Parent4 {

	public static void staticMethod() {

		System.out.println("Static method in Child class");
	}
}

public class W17overrideStaticMethod {

	public static void main(String[] args) {

		Parent4 p = new Parent4();
		
		Parent4.staticMethod();
		
		System.out.println("-----------");
		
		Child4 c = new Child4();
		
		c.staticMethod();
		
		

	}

}
