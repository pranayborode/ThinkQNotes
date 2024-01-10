package com.assignment2;

public class IncDec {

	public static void main(String[] args) {
		
		int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b; // b=3 , c = 3 
        d = a++; // a=2 , d = 1

        c++;  // 4

        System.out.println("a = " + a); //2
        System.out.println("b = " + b); //3
        System.out.println("c = " + c); //4
        System.out.print("d = " + d);   //1


	}

}
