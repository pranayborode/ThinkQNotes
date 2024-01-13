package com.asg11staticfinal;

import java.util.Scanner;

//1)Write a method to convert currency from rs. to dollars. 
//It will take rs. As input and return the equivalent amount in dollars.The exchange rate is 69.2 rs equals 1$


public class A1CurrencyConverter {

	public static double convertRstoDollars(double rsAmount) {
		
		double excangeRate = 69.2;
		
		double dollars = rsAmount/ excangeRate;
		
		return dollars;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount in Rs : ");

		double rsAmount = sc.nextDouble();
		
		double dollars = convertRstoDollars(rsAmount);
		
		System.out.println(rsAmount +"Rs is equal to "+dollars+"$");
	}

}
