package com.asg11staticfinal;

//14.	Write another program same as above but check final static variable.

public class Q14FinalStaticVariable {

	private static final String finalstaticMessage;

	static {
		finalstaticMessage = "Good Morning";
	}
	
	public Q14FinalStaticVariable() {
		//this.finalstaticMessage = "Default message";  //can't Initialize final static variable 
	}


	public static final void staticFinalMethod() {
		System.out.println("staticFinalMethod is executed");
		System.out.println("Final static message : "+finalstaticMessage);
	}
	
	public static void main(String[] args) {

		staticFinalMethod();
	}

}
