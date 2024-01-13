package com.assignment17inheritanceabstractclass;


//1. Create an abstract class Machine with an implemented / concrete method 
//rotate and an abstract method crush. Create a class Juicer which extends this 
//abstract class Machine and implements method crush. Now, add another 
//method filter in the class Juicer. In main method, 
//a. Create an object of type Juicer and calls its crush, rotate and filter 
//methods. 
//b. Create an object of type Juicer with reference variable of Machine 
//(Machine m = new Juicer). Check the methods available to m.


abstract class Machine {
	
	 void rotate() {
		System.out.println("Abstract class concrete method- rotate");
	}
	
	abstract void crush();
}

class Juicer extends Machine{

	@Override
	void crush() {
		System.out.println("Implemented method crush");
		
	}
	
	void filter() {
		System.out.println("Filter method");
	}
}

public class Q1MachineJuicerExample {

	public static void main(String[] args) {
		Juicer j1 = new Juicer();
		
		j1.rotate();
		j1.crush();
		j1.filter();

		System.out.println("-------------------");
		
		Machine m1 = new Juicer();
		
		m1.rotate();
		m1.crush();
		//m1.filter();  The method filter() is undefined for the type Machine
	}

}
