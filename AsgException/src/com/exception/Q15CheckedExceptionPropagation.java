package com.exception;

import java.io.IOException;

//15. WAP to check whether Checked Exception is propagated in calling stack  
public class Q15CheckedExceptionPropagation {

	void method1() throws IOException {
		throw new IOException("Input error...");

	}

	void method2() throws IOException {
		method1();
	}

	void method3() throws IOException {

		method2();

	}

	public static void main(String[] args) throws IOException {

		Q15CheckedExceptionPropagation obj = new Q15CheckedExceptionPropagation();
		obj.method3(); // or we can write here try catch insted of throws IOException in main;

	}

}
