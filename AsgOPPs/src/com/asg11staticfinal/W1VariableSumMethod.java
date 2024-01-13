package com.asg11staticfinal;


//1.Write a method to accept variable no of integers. Method should find sum of all the integers and display the result.
public class W1VariableSumMethod {

	private static int sumInteger(int... numbers) {   //Var-Args
		int sum = 0;
		
		for(int num : numbers) {
			sum +=num;
		}
		
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		
		int result = sumInteger(1,2,3,4,5);
		System.out.println("Sum of integers : "+result);

	}

}
