package com.lab13;

class A1 {
	public A1(int i) {
		System.out.println(myMethod(i));
	}
	
	int myMethod(int i) {
		return ++i + --i;
	}
}

class B1 extends A1{
	public B1(int i, int j) {
		super(i*j);
		//System.out.println(myMethod(i, j));
	}
	
	int myMehtod(int i, int j) {
		return myMethod(i*j);
	}
}

public class MainClass3 {

	public static void main(String[] args) {
		B1 b = new B1(12, 21);

	}

}
