package com.lab12CW;

class Mobile {
	private String brand;
	private String netType;

	public Mobile() {

	}

	public Mobile(String brand, String netType) {
		super();
		this.brand = brand;
		this.netType = netType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNetType() {
		return netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
	}

	public String toString() {
		return "Mobile : brand=" + brand + ", netType=" + netType;
	}

}


class Android extends Mobile {
	
	private String model;
	private int androidversion;
	
	
	public Android() {
		super();
		
	}
	public Android(String brand, String netType, String model, int androidversion) {
		super(brand, netType);
		this.model = model;
		this.androidversion = androidversion;
		
	}
	
	
	
}

public class MobileShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
