package com.assignment2;

public class Rules {

	public static void main(String[] args) {
		
	    System.out.println(10 * 5 + 100 * (25 * 11) / (25 * 10) * 10 - 5 + 7 % 2);
	    //                 10 * 5 + 100 * 275 / 250 * 10 - 5 + 1
	    //                 10 * 5 + 100 * 1 * 10 - 5 + 1
	    //                 50 + 1000 -5 + 1
	    //                 1050 - 4
	    //                 1046
	    
	    
	    int zx = (10 * 5 + 100 * (25 * 11));
	    //        10 * 5 + 100 * 275
	    //        50 + 27500
	    //        27550
	    
	    int yz = ((25 * 10) * 10 - 5 + 7 % 2);
	    //         250 * 10 - 5 + 7 % 2
	    //         2500 - 5 + 1 
	    //         2500 - 4
	    //         2496
	    
	    System.out.println(zx / yz); // 27550 / 2496 = 11
	   
	    


	}

}
