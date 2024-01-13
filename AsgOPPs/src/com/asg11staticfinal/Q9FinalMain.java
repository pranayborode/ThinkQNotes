package com.asg11staticfinal;

//9.	WAP to Show 3 use of final - final class, final variable and final method

final class FinalClass {
	
	final int a = 10;

	final void finalMethod() {
		System.out.println("Final Method");
	}
}

public class Q9FinalMain {
	

	public static void main(String[] args) {
		
		FinalClass f1 = new FinalClass();
		
		System.out.println("Final Veriable : "+f1.a);  // Accessing the final variable
		
		f1.finalMethod();  // Calling the final method

	}

}
