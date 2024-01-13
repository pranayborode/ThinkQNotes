package com.asg12inheritance;


class Vehicle2 {
	String type;

	public Vehicle2(String type) {
		this.type = type;
	}

	void displayType() {
		System.out.println("Type of vehicle : " + type);
	}
}

class Car2 extends Vehicle2 {
	String brand;

	Car2(String type, String brand) {
		super(type);
		this.brand = brand;
	}

	void displayBrand() {
		System.out.println("Brand of Car : " + brand);
	}
}

class Model extends Car2{

	String model;
	
	Model(String type, String brand, String model) {
		super(type, brand);
		this.model = model;
	}
	
	void displayModel() {
        System.out.println("Model of Sedan: " + model);
    }
}

public class MultilevelInheritance2 {

	public static void main(String[] args) {
		
		Model m1 = new Model("Four-Wheeler", "Honda", "Amaze");
		
		m1.displayType();
		m1.displayBrand();
		m1.displayModel();

	}

}
