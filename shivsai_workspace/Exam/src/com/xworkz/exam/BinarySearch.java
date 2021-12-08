package com.xworkz.exam;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		byte[] numbers = {11,22,44,-13,56,7,4,3,6};
		byte num = 56;
		BinarySearch.search(numbers, num);

	}

	public static void search(byte[] numbers, byte num) {
		Arrays.sort(numbers);
		boolean temp = true;

		int start = 0;
		int end = numbers.length;
		int mid = numbers.length / 2;

		while (mid > start && mid < end) {
			if (numbers[mid] == num) {
				System.out.println(num + " is found in array");

				break;
			} else if (num > numbers[mid]) {
				start = mid;
				mid = (start + end) / 2;

			} else if (num < numbers[mid]) {
				end = mid;
				mid = (start + end) / 2;
			}
		}
	}
}