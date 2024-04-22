package com.lab12CW;

class Vehical {

	private int  modelNo;
	private double price;

	
	
	public Vehical() {

	}

	public Vehical(int  modelNo, double price) {
		this.modelNo = modelNo;
		this.price = price;
	}

	public int  getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Vehical : modelNo=" + modelNo + ", price=" + price;
	}

}

class Car extends Vehical{
	
	private String brand;
	private String fuelType;
	
	
	public Car() {
		super();
	}
	
	public Car(int modelNo, double price,String brand,String fuelType  ) {
		super(modelNo, price);
		this.brand = brand;
		this.fuelType = fuelType;
	}

	
	public String toString() {
		return    super.toString()+", Car :" + brand + ", fuelType=" + fuelType;
	}
	
	
	
}

public class SuperDemo2 {

	public static void main(String[] args) {
		Car c1 = new Car(2234, 980000, "Tata", "Petrol");
		
		System.out.println(c1);
	}
	
	
}
