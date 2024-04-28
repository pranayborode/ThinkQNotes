package com.lambdademo;

@FunctionalInterface
interface Movable {
	void move();

	default void changeSpeed() {
		System.out.println("Speed has been increased...");
	}

}

public class InterfaceDemo implements Movable {

	@Override
	public void move() {
		System.out.println("Object is moving..");
		
	}
	
	public static void main(String[] args) {
		
		Movable car = new InterfaceDemo();
		car.move();
		
		Movable ball = new InterfaceDemo();
		ball.move();
	}
	

}
