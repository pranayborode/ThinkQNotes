package com.lab10;

public class FindSquare {

	public void square(int num) {
		System.out.println("Square of int num "+num +" is "+(num*num));
	}
	
	public void square(float num) {
		System.out.println("Square of float num "+num +" is "+(num*num));
	}
	
	public void square(double num) {
		System.out.println("Square of double num "+num +" is "+(num*num));
	}
	
	public static void main(String[] args) {
		
		FindSquare sq = new FindSquare();
		
		sq.square(5);
		sq.square(2.2f);
        sq.square(89d);
	}

}
