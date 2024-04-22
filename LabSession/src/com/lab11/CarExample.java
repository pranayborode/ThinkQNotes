package com.lab11;

public class CarExample {

	public static void main(String[] args) {
		
		CarEngine ce1 = new CarEngine("Petrol");
		Car c1 = new Car("Tata Nexon", 475000, ce1);
		
		System.out.println(c1);
		
		System.out.println("------------------------------------------------");
		
		Car c2 = new Car("Hyundai Ev", 780000, new CarEngine("Ev"));		
		System.out.println(c2);
		
		System.out.println("------------------------------------------------");

		Car c3 = new Car();
		
		c3.setCmodel("Mahindra");
		c3.setCprice(7458000);
		
		c3.setCarEngine(new CarEngine());
		c3.getCarEngine().setEtype("Disel");;
		
		System.out.println(c3);
		
		
	

	}

}
