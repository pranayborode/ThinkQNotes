package com.assignment16wrapperclasses;

// 3.	Which Wrapper class has 3 constructors.
// Ans - Float

//the Float wrapper class in Java indeed has three constructors, 
//and the third constructor takes a double type as an argument.


public class Q3ThreeConstructor {

	public static void main(String[] args) {
		Float f1 = new Float(14.88f);
		Float f2 = new Float(78.77);
		Float f3 = new Float("71.89");

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

	}

}
