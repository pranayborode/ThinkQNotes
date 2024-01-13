package com.asg11staticfinal;

//7.	WAP to check whether you can inherit static variable of Parent class in Child class
//8.	WAP to check whether you can inherit static method of Parent class in Child class
class Parent1 {

	static int p = 10;

	static void staticMethod() {
		System.out.println("Static Method in Parent Class");
	}

}

public class Q7Child1 extends Parent1 {

	public static void main(String[] args) {

		Q7Child1 c1 = new Q7Child1();

		System.out.println("Static variable from Parent class: " + Q7Child1.p);

		Q7Child1.staticMethod();

	}

}
