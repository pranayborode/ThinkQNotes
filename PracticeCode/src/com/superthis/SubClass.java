package com.superthis;

class SupperClass{
	
	int i = 10;
	
	SupperClass(){
		System.out.println("Default Constructor Called");
	}
	
	SupperClass(int i){
		System.out.println("Parameterized Constructor Called "+i);
	}
	
	void methodOfSupperClass() {
		System.out.println("Method of supper class");
	}
}

public class SubClass extends SupperClass {
	
	public SubClass() {
	    super(10);
	    System.out.println("SubClass Constructor Called");
	}
	
	void methodOfSubClass() {
		super.methodOfSupperClass();
		System.out.println("Method of sub Class Called");
		System.out.println("i = "+super.i);
	}

	public static void main(String[] args) {
		
		SubClass s = new SubClass();
		
		s.methodOfSubClass();

	}

}
