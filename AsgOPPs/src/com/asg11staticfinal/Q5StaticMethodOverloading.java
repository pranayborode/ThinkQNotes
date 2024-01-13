package com.asg11staticfinal;

//5.	See if you can overload static method, by using static keyword for 
//      2nd overloaded method and without using static keyword.
public class Q5StaticMethodOverloading {

	// overloading method using static keyword
	static void add(int x, int y) {
		System.out.println("x + y = " + (x + y));
	}

	static void add(int x, int y, int z) {
		System.out.println("x + y + z = " + (x + y + z));
	}

	// overloading method without using static keyword
	void mul(int x, int y) {
		System.out.println("x - y = " + (x * y));
	}

	void mul(int x, int y, int z) {
		System.out.println("x + y + z = " + (x * y * z));
	}

	public static void main(String[] args) {

		Q5StaticMethodOverloading s1 = new Q5StaticMethodOverloading();

		add(5, 8);
		add(7, 8, 9);

		s1.mul(6, 3);
		s1.mul(7, 6, 5);
	}

}
