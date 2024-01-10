package com.assignment4;

public class Jerusalem {

	public static void main(String[] args) {

		int i = 1, j = 0;
		switch (i) {
		case 2:
			j += 6;
		case 4:
			j += 1;
		default:
			j += 2;
		case 0:
			j += 4;
		}
		System.out.println("j = " + j);

//		Result:
//      default ---> j = j+2 = 0+2 = 2
//      case 0  ---> j = j+2 = 4+2 = 6    
//              ---> j
//			j = 6	
	}

}
