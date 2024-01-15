package com.exception;

//14. WAP to check whether Unchecked Exception is propagated in calling stack 
public class Q14CheckUncheckedExPropagated {

	void method1() {
		throw new ArithmeticException("Divide by zero");

	}

	void method2() {
		method1();
	}

	void method3() {
		method2();

	}

	public static void main(String[] args) {
		
		Q14CheckUncheckedExPropagated obj = new Q14CheckUncheckedExPropagated();
		
		obj.method3();
	}	
		

}
