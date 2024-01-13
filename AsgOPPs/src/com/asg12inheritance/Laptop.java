package com.asg12inheritance;

//4.Create Class Laptop which has variables noOfUSBPort, processorSpeed of type int. 
//  Create getter, setter methods for the variables. 
//  In main method, 1> create Laptop object 
//  2> set values of variables noOfUSBPort, processorSpeed using setter methods. 
//  3> print variables noOfUSBPort, processorSpeed using getter methods.

public class Laptop {

	private int noOfUSBPort;
	private int processorSpeed;

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public static void main(String[] args) {
		
		Laptop myLaptop = new Laptop();
		
		myLaptop.setNoOfUSBPort(2);
		myLaptop.setProcessorSpeed(64);
		
		System.out.println(myLaptop.getNoOfUSBPort());
		System.out.println(myLaptop.getProcessorSpeed());

	}

}
