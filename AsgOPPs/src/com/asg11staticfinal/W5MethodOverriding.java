package com.asg11staticfinal;

//5.	Write a meaningful program to show the use of method overriding.

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
	
	public void accelerate(long mph) {                                  //method overriding.
		System.out.println("Car is Accelerating at "+mph+"mph");
	}
}


public class W5MethodOverriding {

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
