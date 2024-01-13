package com.asg11staticfinal;


//13.	WAP with 2 constructor (Default and parameterized), one instance method, 
//one static method and check if final variable is not initialize at the time of declaration 
//so where we can initialize them.

public class W13finalVariableinitialization {

	private final String finalMessage;
	
	public W13finalVariableinitialization() {
		this.finalMessage = "Default message"; //Initialize final variable in the default constructor
	}
	
	public W13finalVariableinitialization(String newMessage) {
		this.finalMessage = "New Message : "+newMessage; // // Initialize final variable in the parameterized constructor
	}
	
	public void finalMethod() {
        System.out.println("Final Message: " + this.finalMessage);
    }
	
	public static void staticMethod() {
        System.out.println("Static method is executed.");
    }
	public static void main(String[] args) {
		
		W13finalVariableinitialization fvi1 = new W13finalVariableinitialization();
		fvi1.finalMethod();
		
		W13finalVariableinitialization fvi2 = new W13finalVariableinitialization("Welcome");
		fvi2.finalMethod();
		
		staticMethod();

	}

}
