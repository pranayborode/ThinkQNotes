package com.asg7opps;

import java.util.Scanner;

public class Q15Student {

	private String name;
	private int marksMath;
	private int marksScience;
	private int marksEnglish;

	public Q15Student(String name, int marksMath, int marksScience, int marksEnglish) {
		this.name = name;
		this.marksMath = marksMath;
		this.marksScience = marksScience;
		this.marksEnglish = marksEnglish;
	}

	public double calcPercentage() {
		double perc = (marksMath + marksScience + marksEnglish)/3;
		return perc;
	}

	public void printResult() {
		double per = calcPercentage();
		
		System.out.println("Result for "+name+" : ");
		System.out.println("Maths Marks   : "+marksMath);
		System.out.println("Science Marks : "+marksScience);
		System.out.println("English Marks : "+marksEnglish);
		System.out.println("Percentage    : "+per+"%");
		
		
		if(per>=75) {
			System.out.println("Result : 1st Class");
		}else if(per >=60) {
			System.out.println("Result : 2nt Class");
		}else if (per >=45) {
			System.out.println("Result : 3rd Class");
		}else {
			System.out.println("Result : Fail");
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student name : ");
		String name = sc.next();
		
		System.out.println("Enter Maths markas : ");
		int marksMath = sc.nextInt();
		
		System.out.println("Enter Science markas : ");
		int marksScience = sc.nextInt();
		
		System.out.println("Enter English markas : ");
		int marksEnglish = sc.nextInt();
		
		
		Q15Student s = new Q15Student(name, marksMath, marksScience, marksEnglish);
		
		s.printResult();
		sc.close();
		
	}

}
