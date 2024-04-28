package com.lambdademo;

public class AnonymousInner {

	public static void main(String[] args) {

		Movable car = new Movable() {

			@Override
			public void move() {
				System.out.println("Car is moving..");

			}
		};
		car.move();
		//car.changeSpeed();

		Movable ball = new Movable() {

			@Override
			public void move() {
				System.out.println("Ball is moving...");

			}
		};

		ball.move();
	}

}
