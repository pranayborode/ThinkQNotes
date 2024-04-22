package com.lab16CW;


interface Flyable{
	void fly_obj();
}


class Spacecraft implements Flyable{

	@Override
	public void fly_obj() {
		System.out.println("Spacecraft Fly");
		
	}
	
}

class Airplane implements Flyable{

	@Override
	public void fly_obj() {
		System.out.println("Airplane Fly");
		
	}
	
}
class Helicopter implements Flyable{

	@Override
	public void fly_obj() {
		System.out.println("Helicopter Fly");
		
	}
	
}
public class FlyableMainDemo {

	public static void main(String[] args) {
		
		Spacecraft s = new Spacecraft();
		s.fly_obj();
		
		Airplane a = new Airplane();
		a.fly_obj();
		
		Helicopter h = new Helicopter();
		h.fly_obj();

	}

}
