package com.xworkz.programs;

import java.util.Scanner;

public class Sunny {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the number :");
		int x = ref.nextInt();
		prime(x);
		palyndrome(x);
		amstrong(x);
		techNumber(x);
		sunny(x);
		System.out.println(autoMorphic(x) ? x + " is a automorphic" : "not an automorphic");
		neon(x);
	}

	public static void prime(int x) {
		int flag = 0;
		if (x == 0 || x == 1) {
			System.out.println(x + " number is not prime");
		} else {
			int m = x / 2;
			for (int i = 2; i <= m; i++) {
				if (x % i == 0) {
					System.out.println(x + " not prime number");
					flag++;
				}

			}
		}
		if (flag == 0) {
			System.out.println(x + " number is prime");
		}

	}

	public static void amstrong(int x) {
		int newnum = x;
		int sum = 0;
		while (x != 0) {
			int rem = x % 10;
			sum += Math.pow(rem, 3);
			x /= 10;
		}
		if (newnum == sum) {
			System.out.println(newnum + "\tnumber is amstrong");
		}
	}

	public static void techNumber(int x) {
		int code = x;
		int temp = x;
		int digit = 0;
		while (temp > 0) {
			digit++;
			temp /= 10;
		}
		if (digit % 2 == 0) {
			x = temp;
			int firsthalf = x % (int) Math.pow(10, digit / 2);
			int secondhalf = x / (int) Math.pow(10, digit / 2);
			int squareOfSum = (firsthalf + secondhalf) * (firsthalf + secondhalf);
			if (temp == squareOfSum) {
				System.out.println(code + " given number is techNumber");
			} else {
				System.out.println(code + " not tech number");
			}
		} else {
			System.out.println("\t is not a tech number");
		}

	}

	public static int fact(int x) {
		int sum = 0;
		while (x != 0) {
			sum = sum * x;
			x--;
		}
		return sum;
	}

	public static void krishnaMurthiNumber(int x) {

	}

	public static void sunny(int x) {
		int num = x + 1;
		double sqroot = Math.sqrt(num);
		if (sqroot - Math.floor(sqroot) == 0) {
			System.out.println(x + " given number is sunny");
		} else {
			System.out.println(x + " is not sunny");
		}
	}

	public static void neon(int x) {
		int square = x * x;
		int rem, sum = 0;

		while (square > 0) {
			rem = square % 10;
			sum += rem;
			square /= 10;
		}
		if (x == sum) {
			System.out.println(x + "\t number is neon");
		} else {
			System.out.println(x + "\tnumber is not neon");
		}

	}

	public static boolean autoMorphic(int x) {
		int square = x * x;
		while (x > 0) {
			if (x % 10 != square % 10) {
				return false;
			}
			x /= 10;
			square /= 10;

		}
		return true;
	}

	public static void palyndrome(int x) {
		int temp = x;
		int rem, sum = 0;
		while (temp > 0) {
			rem = temp % 10;
			sum = (sum * 10) + rem;
			temp /= 10;

		}
		if (sum == x) {
			System.out.println(x + " number is palyndrome");
		} else {
			System.out.println(x + " not a palyndrome");
		}

	}

}
