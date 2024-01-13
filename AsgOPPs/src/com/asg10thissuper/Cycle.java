package com.asg10thissuper;

// Constructor Chaining ASSIGNMENT
// 1.	Create a class Cycle with member variables: int accountNo, int noOfWheels.
// 2.	Create a default constructor with a SOP in it “I am default constructor”
// 3.	Create another constructor which takes 2 arguments, calls the default constructor 
//      using this() and has a SOP in it “I am another constructor”.
// 4.	In main method, create an object of type Cycle by using default constructor. Note the output.
// 5.	Create another object of type Cycle by using the parameterized constructor. 
//      Note the sequence of SOPs indicating that inner most ctor is called first.


public class Cycle {

	private int accountNo;
	private int noOfWheels;
	
	public Cycle() {
		System.out.println("I am default constructor");
	}
	
	
	
	public Cycle(int accountNo, int noOfWheels) {
		
		this();
		this.accountNo = accountNo;
		this.noOfWheels = noOfWheels;
		System.out.println("I am another constructor");
	}

	public String toString() {
		return accountNo+"   "+noOfWheels;
		
	}


	public static void main(String[] args) {
		
		Cycle c1 = new Cycle();
		System.out.println(c1);  //I am default constructor
		                         //0   0
		
		Cycle c2 = new Cycle(223344, 4);
		System.out.println(c2);  //I am default constructor
		                         //I am another constructor
		                         //223344   4

	}

}
