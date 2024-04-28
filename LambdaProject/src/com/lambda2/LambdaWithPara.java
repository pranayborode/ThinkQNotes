package com.lambda2;

interface speedable{
	
	void move(float speed);
}

//omit
//single argument: ()
// single line of code: {}

public class LambdaWithPara {

	public static void main(String[] args) {
		
		speedable car = (speed)->{
			System.out.println("Welcome");
			System.out.println("Car is moving with speed "+speed+"km/hr");
		};
		
		car.move(60);
		
		
		speedable truck = speed -> System.out.println("Truck is moving with speed "+speed+"Km/hr");
		truck.move(70);
		
		
	}

}
