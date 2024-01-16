package com.nonstatic;

class A {
	int nonStaticVariable;
	static int staticVariable;
	
	static void staticMethod() {
		System.out.println("Static Mehtod Call");
		//System.out.println(nonStaticVariable);
		System.out.println(staticVariable);
	}
	
	void nonStaticMethod() {
		System.out.println("Non Sttic Method call");
		System.out.println(nonStaticVariable);
		System.out.println(staticVariable);
	}
}

public class MainClass {

	public static void main(String[] args) {
		A.staticVariable = 10;
		//A.nonStaticVariable = 20;
		
		A.staticMethod();
	//	A.nonStaticMethod();
		
		A a1 = new A();
		A a2 = new A();
		
		System.out.println(a1.nonStaticVariable);
		System.out.println(a1.staticVariable);
		
		a1.nonStaticMethod();
		a2.staticMethod();
		
		System.out.println(a2.staticVariable);
		a1.staticVariable = 30;
		System.out.println(a2.staticVariable);
		

	}

}
