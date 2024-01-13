package com.assignment15overriding;


//3)WAP to create class Vehicle with methods accelerate(long mph) with long type parameter ,
//stop(),run() all method return string type of value. Create class car which extends 
//		Vehicle implement accelerate(long mph)differently in car class.

class Vehical {
	
	public void accelerate(long mph) {
		System.out.println("Vehical is Accelerating at "+mph+"mph");
	}
	
	public String stop() {
		return "Vehical is stoping";
	}
	
	public String run() {
		return "Vehical is running";
	}
	
}

class Car extends Vehical{
	
	public void accelerate(long mph) {
		System.out.println("Car is Accelerating at "+mph+"mph");
	}
}

public class VehicalCarExample {

	public static void main(String[] args) {
		
		Vehical v = new Vehical();
		v.accelerate(60);
		System.out.println(v.stop());
		System.out.println(v.run());
		
		System.out.println("-------------------------------");
		
		Car c = new Car();
		
		c.accelerate(80);
		System.out.println(c.stop());
		System.out.println(c.run());

	}

}
