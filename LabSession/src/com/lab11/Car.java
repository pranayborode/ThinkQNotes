package com.lab11;

public class Car {

	private String cmodel;
	private int cprice;
	private CarEngine carEngine;

	public Car() {

	}

	public Car(String cmodel, int cprice,CarEngine carEngine ) {
		this.cmodel = cmodel;
		this.cprice = cprice;
		this.carEngine = carEngine;
	}
	
	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}
	
	public String getCmodel() {
		return cmodel;
	}
	
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	
	public int getCprice() {
		return cprice;
	}
	
	public void setCarEngine(CarEngine carEngine) {
		this.carEngine =carEngine;
	}
	public CarEngine getCarEngine() {
		return carEngine;
	}
	
	public String toString() {
		return "Car : CarModel - "+cmodel+ ", CarPrice - "+cprice+", \n"+carEngine;
	}
	
}
