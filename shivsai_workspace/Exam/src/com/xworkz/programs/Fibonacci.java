package com.xworkz.programs;

public class Fibonacci {

	public static void main(String args[]) {
		int input = 245;
		int result = findNearestFibonacciNumber(input);

		System.out.print("The nearest num for " + input + "is " + result);
	}

	public static int findNearestFibonacciNumber(int input) {

		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("fibonacci series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		return secondTerm;

	}
}
