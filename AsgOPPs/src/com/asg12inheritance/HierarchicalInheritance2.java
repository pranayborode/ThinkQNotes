package com.asg12inheritance;


class Vehicle3{
	String type;

	public Vehicle3(String type) {
		this.type = type;
	}

	void displayType() {
		System.out.println("Type of vehicle : " + type);
	}
}

class Car3 extends Vehicle3 {
	
	String brand;

	Car3(String type, String brand) {
		super(type);
		this.brand = brand;
	}

	void displayBrand() {
		System.out.println("Brand of Car : " + brand);
	}

}

class Bike extends Vehicle3 {
	String brand;

	Bike(String type, String brand) {
		super(type);
		this.brand = brand;
	}

	void displayBrand() {
		System.out.println("Brand of Bike : " + brand);
	}

}
public class HierarchicalInheritance2 {

	public static void main(String[] args) {
		Car3 myCar = new Car3("Four-Wheeler", "Tata");

		myCar.displayType();
		myCar.displayBrand();
		
		Bike myBike = new Bike("Two-Wheeler", "TVS");
		
		myBike.displayType();
		myBike.displayBrand();

	}

}
