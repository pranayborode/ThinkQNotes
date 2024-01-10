package com.assignment2;

public class IncrementDecrementQuiz11 {

	public static void main(String[] args) {

		int i = 0, j = 0;

		System.out.println(--i * i++ * ++j * j++);

		// -1 * -1 * 1 * 1 = 1s\
		
		// i = 0 / -1 / 0
		// j = 0 / 1 / 2
		System.out.println(i); //0
		System.out.println(j); //2
	}

}
