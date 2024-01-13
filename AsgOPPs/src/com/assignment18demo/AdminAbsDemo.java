package com.assignment18demo;

import com.assignment18abstractinterface.WifyAbsDemo;

public class AdminAbsDemo extends WifyAbsDemo {

	private int aId;
	private String aName;

	public AdminAbsDemo(String wifyName, String password, int aId, String aName) {
		super(wifyName, password);
		this.aId = aId;
		this.aName = aName;
	}

	@Override
	protected void accessWify() {
		System.out.println("Wify connected : "+aName);

	}

	@Override
	public String toString() {
		return "AdminAbsDemo : aId=" + aId + ", aName=" + aName + super.toString();
	}

	public static void main(String[] args) {

		AdminAbsDemo aad = new AdminAbsDemo("Jio Fiber", "1234", 210, "Rahul");
		System.out.println(aad);
	}

}
