package com.asg11staticfinal;


// 1. Create a class Car with String model and inttotalCarSold as static variable in main() method.
// 2. Change the value of variable by class name then Print it.
// 3. Create two object of Car class and change value of static variable by 1st object and print it by accessing 2nd object.


public class Q1Car {

	private String model;
	static int totalCarSold;
	
	
	
	public Q1Car() {
		
	}

	public Q1Car(String model) {
		this.model = model;
	}



	public static void main(String[] args) {
		
		Q1Car c1 = new Q1Car("Sedan");
	
		Q1Car.totalCarSold = 123;
		
		System.out.println("Model : "+c1.model);                  //Model : Sedan
		System.out.println("Toatl Car Sold : "+Q1Car.totalCarSold);  //Toatl Car Sold : 123
		
		Q1Car c2 = new Q1Car();
		Q1Car c3 = new Q1Car();
		
		c2.totalCarSold= 999;
		
		System.out.println("Total car sold using c3 object - "+c3.totalCarSold); //999
		
		

	}

}
