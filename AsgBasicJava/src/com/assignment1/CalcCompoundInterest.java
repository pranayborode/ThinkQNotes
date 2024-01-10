package com.assignment1;


// 17. Write a Java program to enter P, T, R and calculate Compound Interest


// CI = P (1 + r/n)nt - P

public class CalcCompoundInterest {

	public static void main(String[] args) {
		
		double principle, rate, n, time, compoundInterest;
		
		principle = 10000;
		rate = 12;
		n = 1;
		time = 1;
		
		compoundInterest = principle * (Math.pow(1+(rate/n), n*time)) - principle;   //Check correct formula
		
		System.out.println(compoundInterest);

	}

}
