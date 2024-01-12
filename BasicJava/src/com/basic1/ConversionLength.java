package com.basic1;

public class ConversionLength {

	public static void main(String[] args) {
	
		double meter = 2300;
		
		double kelometer = (meter/1000);
		double cm = (meter*100);
		
		System.out.println(meter+"m is equal to "+kelometer+"km");
		System.out.println(meter+"m is equal to "+cm+"Cm");

	}

}
