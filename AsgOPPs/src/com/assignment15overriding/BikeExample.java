package com.assignment15overriding;

//5)WAP to create class Bike with fields color ,speed and  method bikeInfo() 
//which is show color and speed of bike .create class Pulsar which extends 
//Bike implement bikeInfo() differently child 

class Bike {
	private String color;
	private int speed;

	public Bike(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public void bikeInfo() {
		System.out.println("Bike colour is " + color);
		System.out.println("Bike speed is " + speed);
	}
}

class Pulsar extends Bike {

	public Pulsar(String color, int speed) {
		super(color, speed);
	}
	
	public void bikeInfo() {
		System.out.println("Pulsar bike information :");
		super.bikeInfo();
	}

}

public class BikeExample {

	public static void main(String[] args) {
		
		Pulsar p = new Pulsar("Black", 150);
		
		p.bikeInfo();

	}

}
