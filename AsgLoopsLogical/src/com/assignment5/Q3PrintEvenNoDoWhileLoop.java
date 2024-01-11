package com.assignment5;

//3.WAP to print even numbers from 121 to 229 using do-while loop. 

public class Q3PrintEvenNoDoWhileLoop {

	public static void main(String[] args) {

		int i = 121;                          
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 229);

	}

}
