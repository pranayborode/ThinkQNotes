package com.lambdademo;


/// Movable car = ()->{};

public class LambdaDemo {

	public static void main(String[] args) {

		Movable car = () -> {
			System.out.println("Car is moving...");
		};
		car.move();

		Movable ball = () -> {
			System.out.println("Ball is moving...");
		};

		ball.move();
	}

}
