package com.lab14;

//The temperature of a chemical is 100 degree celsius. 
//Every hour the temperature drops by 7 degrees. 
//WAP to print the hours required when the temperature drops below 60 degrees.
public class TemperatureDrop {

	public static int calcHoursRequired(int initialTemp) {

		int tempDropPerHr = 7;
		int targetTemp = 60;

		int hoursRequired = 0;

		while (initialTemp >= targetTemp) {
			initialTemp -= tempDropPerHr;

			hoursRequired++;
		}

		return hoursRequired;
	}

	public static void main(String[] args) {

		int initialTemp = 100;

		int hoursRequired = calcHoursRequired(initialTemp);

		System.out.println(hoursRequired+" Hours required to drop the temperature below 60 degrees ");
	}

}
