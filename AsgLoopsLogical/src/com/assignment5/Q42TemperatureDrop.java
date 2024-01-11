package com.assignment5;

public class Q42TemperatureDrop {

	public static void calcTempDrop() {
		
		int initialTemp = 100;
        int tempDropPerHour = 7;
        int targetTemp = 60;

        int hours = 0;
        int currentTemp = initialTemp;

        while (currentTemp >= targetTemp) {
            currentTemp-= tempDropPerHour;
            hours++;
        }

        System.out.println(hours + " hours for the temperature to drop below 60 degrees.");
    
	}
	
	public static void main(String[] args) {
		calcTempDrop();

	}

}
