package com.asg12inheritance;

class Vehicle {
	String type;

	public Vehicle(String type) {
		this.type = type;
	}

	void displayType() {
		System.out.println("Type of vehicle : " + type);
	}
}

class Car extends Vehicle {
	String brand;

	Car(String type, String brand) {
		super(type);
		this.brand = brand;
	}

	void displayBrand() {
		System.out.println("Brand of Car : " + brand);
	}

}



public class SingleInheritance2 {

	public static void main(String[] args) {

		Car myCar = new Car("Four-Wheeler", "Tata");

		myCar.displayType();
		myCar.displayBrand();
		
		

	}

}
