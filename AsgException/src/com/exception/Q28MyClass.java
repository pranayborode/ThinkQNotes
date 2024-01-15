package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//28. Create a class MyClass and create three methods myMethod1(), Method2() and Method3(). 
//Invoke Method2() from Method1() and Method3() from Method2(). 
//Write a code that can throw an exception inside myMethod3() and compile: File file=new 
//File("filename.txt"); Scanner sc=new Scanner(file); 
//You will get compilation errors now as you are not handling a checked exception 
//FileNotFoundException. Handle the exeption using try catch block

public class Q28MyClass {

	public void myMethod1() throws FileNotFoundException {
		System.out.println("myMethod1");
		myMethod2();
	}

	public void myMethod2() throws FileNotFoundException {
		System.out.println("myMethod2");
		myMethod3();
	}

	public void myMethod3() throws FileNotFoundException {
		System.out.println("myMethod3");

		File file = new File("filename.txt");
		try {
			Scanner sc = new Scanner(file);

			System.out.println("File content: ");
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {

			System.err.println("File not found: " + e);
			throw e;
		}
	}

	public static void main(String[] args) {
		Q28MyClass myClass = new Q28MyClass();
		try {
			myClass.myMethod1();
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e);
		}

	}

}
