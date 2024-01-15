package com.exception;

import java.io.IOException;



//25. WAP to show checked parent exception is first and child exception is second in which case compilation error is seen 



public class Q25CheckParentChildException {

	void method1() throws IOException {
		throw new IOException("Input error...");

	}

	void method2() throws IOException {
		method1();
	}

	void method3()throws IOException {

		method2();

	}

	public static void main(String[] args)  {

		Q25CheckParentChildException obj = new Q25CheckParentChildException();
	//	obj.method3(); //Unhandled exception type IOException

	}
}
