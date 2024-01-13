package com.asg8oppsmethods;

import java.util.Scanner;

//12) write a java program to calculate cube for given number using no return type ,with return type,
//    with parameter passing, with parameter and return type.
public class CubeCalculator {

	Scanner sc = new Scanner(System.in);

	public void calcCubeNoReturn() {

		System.out.print("Enter Number : ");

		int num = sc.nextInt();
		int cube = num * num * num;

		System.out.println("Square with no return type : " + cube);
	}

	public double calcCubeWithReturn() {
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		return num * num * num;
	}

	public double calcCubeWithParaReturn(int num) {
		return num * num;
	}


	public static void main(String[] args) {

		CubeCalculator s1 = new CubeCalculator();
		
		s1.calcCubeNoReturn();
		
		System.out.println("Cube with return type : "+ s1.calcCubeWithReturn());
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("Cube with Parameter and Return type : "+s1.calcCubeWithParaReturn(num));
		
		sc.close();
		
	}

}
