package com.xworkz.programs;

public class Pyremid {

	public static void PyramidPattern(int n)

	{
		for (int i = 0; i < n; i++) {		
			for (int j = n - i; j > 3; j--) {		
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int n = 5;
		PyramidPattern(n);

	}

}
