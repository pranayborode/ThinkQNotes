package com.asg7opps;

// 14) calculate the area of rectangle

public class Q14AreaOfRectangle {


	public void calcArea(int l , int b) {
		double area = l * b; 
		System.out.println("Area of Rectangle : "+area);
	}
	
	public static void main(String[] args) {
		
		Q14AreaOfRectangle r1 = new Q14AreaOfRectangle();
		
		r1.calcArea(14, 18);

	}

}
