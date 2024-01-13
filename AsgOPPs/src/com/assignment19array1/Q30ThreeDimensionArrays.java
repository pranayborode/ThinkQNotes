package com.assignment19array1;

import java.util.Arrays;

//30. WAP to show 3 dimension array. 
public class Q30ThreeDimensionArrays {

	public static void  print3DArrays(int ar[][][]) {
		
		for(int i = 0 ; i< ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				for(int k = 0; k<ar[i][j].length; k++) {
					System.out.print(ar[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
         int arr[][][] = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 
        		          {{3, 5}, {8, 0, 9}, {1, 2, 9, 5}}, 
        		          {{2, 7, 8}, {9, 1}}};
         
         
         print3DArrays(arr);
	}

}
