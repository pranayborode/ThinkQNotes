package com.assignment18abstractinterface;

final class Locker {

	private double money;
	private String jewellery;
	private int pinCode;

	public Locker() {

	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getJewellery() {
		return jewellery;
	}

	public void setJewellery(String jewellery) {
		this.jewellery = jewellery;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
	@Override
	public String toString() {
		return "Locker : money=" + money + ", jewellery=" + jewellery + ", pinCode=" + pinCode;
	}

	public static void main(String[] args) {
		Locker l1 = new Locker();
		
		l1.setMoney(120000);
		l1.setJewellery("Ring");
		l1.setPinCode(1234);
		
		System.out.println(l1);
		
	}

}
