package com.basic2;

public class SimpleInterest {

	public static void main(String[] args) {
		
		double si, p , t, r , ci, n;
		
		p = 10000;
		t = 1;
		r = 12;
		n = 1;
		
		si = (p * t * r) / 100;
		ci = p *(Math.pow(1 + (r/n), n*t)) - p;
		
		System.out.println("Simple Interest : "+si);
		System.out.println("Compound Interest : "+ci);

	}

}
