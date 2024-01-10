package com.assignment2;

public class IncrementDecrementQuiz3 {

	public static void main(String[] args) {
		
		int i = 0; 
		
		i = i++ - --i + ++i - i--; // 0 - 0 + 1 - 1
		
		// i = 0 / 1 / 0 / 1 / 0
		
		System.out.println(i);

	}

}
