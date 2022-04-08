package com.trinitymobility.task;

import java.util.Scanner;

public class MultiInheritenceScanner {

	public static void main(String[] args) {
		MultiInheritence multi = new MultiInheritence();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1 to call multiple inheritence");
		System.out.println("enter 2 for cook items");
		System.out.println("enter 4 for exit");

		while (true) {

			int input = scanner.nextInt();
			if (input == 1) {
				multi.pinch();
				multi.play();
				multi.write();
			}
			if (input == 2) {
				Cooking cook = new Cooking();
				cook.listOfVarieties();

				System.out.println("food is good or not");
				cook.foodIsTasty();
			}
		}
	}
}
