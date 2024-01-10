package com.assignment2;

public class Hikes {

	public static void main(String[] args) {

		int dailywage = 4;
		int number_of_days = 5;
		
		int salary = number_of_days++ * --dailywage * dailywage++ * number_of_days--;
		//              5 * 3 * 3 * 6 = 270
		
		salary = -dailywage;
		//     = -4 
		
		System.out.println(dailywage + " " + number_of_days + " " + salary);
		//                    4                5                     -4

		
		// d   = 4 / 3 / 4
		// nod = 5 / 6 / 5
		// s   = 270 / -4
	}

}
