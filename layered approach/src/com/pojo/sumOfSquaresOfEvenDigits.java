package com.pojo;

public class sumOfSquaresOfEvenDigits {
	private static int a;

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		sumOfSquaresOfEvenDigits.a = a;
	}

	public static int display() {
		int lastDigit = 0;
		int res = 0;
		if (a > 0) {
			while (a != 0) {
				lastDigit = a % 10;
				if (lastDigit % 2 == 0) {
					res = res + lastDigit * lastDigit;
				}
				a = a / 10;
			}
		}
		return res;
	}
}
