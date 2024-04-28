package com.lambda2;

interface addition {
	void computeSum(int n1, int n2);
}

interface subtraction {
	int computeDiff(int n1, int n2);
}

public class LambdaWithMultiPara {

	public static void main(String[] args) {

		addition a1 = (n1, n2) -> System.out.println("Sum is :" + (n1 + n2));
		a1.computeSum(5, 6);

		addition a2 = (int n1, int n2) -> System.out.println("Sum is :" + (n1 + n2));
		a1.computeSum(5, 6);

		subtraction s1 = (n1, n2) -> (n1 - n2);
		System.out.println("SUbtraction : " + s1.computeDiff(7, 3));

	}

}
