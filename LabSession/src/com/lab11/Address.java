package com.lab11;

public class Address {

	private int roomNo; 
	private String city;
	private int pinCode;
	
	public Address() {
		
	}
	
	public Address(int roomNo,String city, int pinCode ) {
		this.roomNo = roomNo;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	public int getRoomNo() {
		return roomNo;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public int getPinCode() {
		return pinCode;
	}
	
	public String toString() {
		return "Address : RoomNo - "+roomNo+", City - "+city+", PinCode - "+pinCode;
	}
}
