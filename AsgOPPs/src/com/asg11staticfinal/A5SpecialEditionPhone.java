package com.asg11staticfinal;



//5)You need to create mobile phones for apple for a special edition. 
//In this edition the color of all the phones has to be "Space Grey". 
//Make sure that the color can never be changed once applied in the system.

public class A5SpecialEditionPhone {

	private final String color;
	private final String brand;
	private int ram;
	private int storage;
	
	
	public A5SpecialEditionPhone(int ram, int storage) {
		this.brand = "Apple";
		this.color = "Space Grey";
		this.ram = ram;
		this.storage = storage;

	}

	
	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}
	

	public int getRam() {
		return ram;
	}


	public int getStorage() {
		return storage;
	}


	public static void main(String[] args) {

		A5SpecialEditionPhone specialPhone = new A5SpecialEditionPhone(16, 64);
		
		//specialPhone.color = "red";  //The final field A5SpecialEditionPhone.color cannot be assigned
		//specialPhone.brand = "Mi";

		System.out.println(specialPhone.getBrand()+" "+" Phone Color : "+specialPhone.getColor()+
				", Ram: "+specialPhone.getRam()+", Storage : "+specialPhone.getStorage());
	}

}
