package com.logical;

import java.util.Scanner;

//s=1!+2!+3!.........+n! find s
public class SumOfFactorialNum {
	
	static void calcFactorial(int num) {
		
		double sumFact = 0;
		for(int i = 1; i<=num ; i++) {
			
			long fact = 1; 
			for(int j=1; j<=i; j++) {
				fact*=j;
			}
			sumFact +=fact;
		}
		System.out.println(sumFact);
		
	}

	public static void main(String[] args) {
		
		System.out.println("enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		calcFactorial(num);

	}

}
