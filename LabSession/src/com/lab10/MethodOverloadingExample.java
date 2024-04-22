package com.lab10;

public class MethodOverloadingExample {

	public void methodTest(Object object) {
		System.out.println("Calling object method");
	}
	 
	public void methodTest(String object) {
		System.out.println("Calling String method");
	}
	
	public void methodTest(Number object) {
		System.out.println("Calling number class method");
	}
	public void methodTest(Integer object) {
		System.out.println("Calling integer class method");
	}
	public void methodTest(Float object) {
		System.out.println("Calling float class method");
	}
	
	public void methodTest(Double object) {
		System.out.println("Calling double class method");
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloadingExample moe = new MethodOverloadingExample();
		//moe.methodTest(null); // 1sr preference to child then object.
		//moe.methodTest(10); // int ---> object // if int method is not present then it call object 
		                      // only if int or Integer type is not present.
		
        moe.methodTest(10); //Integer
		moe.methodTest(10.2f); //Float
		moe.methodTest(25d);   //Double
	}

}
