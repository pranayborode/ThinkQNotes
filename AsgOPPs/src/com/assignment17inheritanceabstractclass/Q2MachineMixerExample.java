package com.assignment17inheritanceabstractclass;

//2. Above we created an abstract class Machine with an abstract method crush
//and a concrete / implemented method rotate. Now create another abstract 
//class Mixer which extends the abstract class Machine, has method crush 
//implemented and has an additional concrete method blend. In main create an 
//object of class of Mixer. Call methods rotate, blend and crush.



abstract class Machine1{
	void rotate() {
		System.out.println("Abstract class concrete method- rotate");
	}
	
	abstract void crush();
}

class Mixer extends Machine1{

	@Override
	void crush() {
		System.out.println("Implemented method crush");
		
	}
	
	void blend() {
		System.out.println("Blend Mehod");
	}
	
}
public class Q2MachineMixerExample {

	public static void main(String[] args) {
		
		Mixer mx = new Mixer();
		
		mx.rotate();
		mx.crush();
		mx.blend();

	}

}
