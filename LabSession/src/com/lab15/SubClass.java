package com.lab15;

//https://www.javatpoint.com/java-operator-precedence
//https://www.scaler.com/topics/operator-precedence-in-java/
//https://www.bouraspage.com/repository/algorithmic-thinking/what-is-the-order-of-precedence-of-logical-operators

abstract class AbstractClassDemo {

	public AbstractClassDemo() {

		System.out.println("This is constructor of abstract class");
	}

	abstract void a_method();

	void nonAbstractMethod() {
		System.out.println("This is a normal mehthod of abstract class");
	}
}

public class SubClass extends AbstractClassDemo {

	@Override
	void a_method() {
		System.out.println("This is abstract method");

	}

	public static void main(String[] args) {

		SubClass sc = new SubClass();

		sc.a_method();
		sc.nonAbstractMethod();

	}

}
