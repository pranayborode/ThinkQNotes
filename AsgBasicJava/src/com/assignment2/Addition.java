package com.assignment2;

public class Addition {

	public static void main(String[] args) {
		
		int a = 4;
        a++; //4
 
        a += a; // a = 5 + 5 = 10 
       
        --a; // 9
        
        a = 7 + a; // a = 7 + 9 = 16
       
        a *= a; // a = 16 * 16 = 256
       
        a -= 3; // a = 256 - 3 = 253

        System.out.println(" a = " + a ); //253

        // a = 4 / 5 / 10 / 9 / 16 / 256 / 253

	}

}
