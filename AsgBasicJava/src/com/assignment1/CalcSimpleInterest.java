package com.assignment1;



// 16. Write a Java program to enter P, T, R and calculate Simple Interest

// SI = (P x r x t)/100

public class CalcSimpleInterest {

	public static void main(String[] args) {
		
		double simpleInterest, principle, time, rate;
		
		principle= 10000;
		
		time = 1; //year
		
		rate = 12;
		
		simpleInterest = (principle*time*rate)/100;
		
		System.out.println("Simple Interest is: "+simpleInterest);

	}

}
