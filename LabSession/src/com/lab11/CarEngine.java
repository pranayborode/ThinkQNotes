package com.lab11;

public class CarEngine {

	private String etype;

	public CarEngine() {

	}
	public CarEngine(String etype) {
		this.etype = etype;
	}
	
	public void startEngine() {
		System.out.println("Start Engine");
	}
	
	
	public void stopEngine() {
		System.out.println("Stop Engine");
	}
	
	public void setEtype(String type) {
		this.etype = etype;
	}
	
	public String getEtype() {
		return etype;
	}

	public String toString() {
		return "CarEngine : Type - "+etype;
	}
}
