package com.assignment18abstractinterface;

public class Wify {

	protected String wifyName;
	protected String password;

	public Wify(String wifyName, String password) {

		this.wifyName = wifyName;
		this.password = password;
	}

	protected static void display() {
		System.out.println("WiFy Connected");
	}

	@Override
	public String toString() {
		return "Wify : wifyName=" + wifyName + ", password=" + password;
	}
	
	

}

