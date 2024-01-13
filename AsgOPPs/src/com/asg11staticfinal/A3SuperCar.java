package com.asg11staticfinal;

// 3)You need to create a super car. It has horsepower and fastest speed. 
// You need to make sure nobody can take your basis of the super car 
// to create a base for a supercar of their own. Write a Java program to ensure the same.

final public class A3SuperCar {

	private int horsepower;
	private double fastestSpeed;

	public A3SuperCar() {
		
	}
	
	public A3SuperCar(int horsepower, double fastestSpeed) {
		this.horsepower = horsepower;
		this.fastestSpeed = fastestSpeed;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public double getFastestSpeed() {
		return fastestSpeed;
	}

	public void setFastestSpeed(double fastestSpeed) {
		this.fastestSpeed = fastestSpeed;
	}

	public static void main(String[] args) {
		A3SuperCar sc = new A3SuperCar(1000, 250.0);
		
		System.out.println("HorsePower   : "+sc.horsepower);
		System.out.println("FastestSpeed : "+sc.fastestSpeed);

		System.out.println("--------------------");
		
		A3SuperCar sc2 = new A3SuperCar();
		sc2.setHorsepower(950);
		sc2.setFastestSpeed(200);
		
		System.out.println("HorsePower   : "+sc2.getHorsepower());
		System.out.println("FastestSpeed : "+sc2.getFastestSpeed());
	}

}
