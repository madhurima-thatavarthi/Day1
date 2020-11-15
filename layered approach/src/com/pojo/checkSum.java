package com.pojo;

public class checkSum {
	private static int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		checkSum.a = a;
	}

	public static void display() {
		int lastDigit = 0;
		int sum = 0;
		if (a > 0) {
			while (a != 0) {
				lastDigit = a % 10;
				if (lastDigit % 2 != 0) {
					sum += lastDigit;
				}
				a = a / 10;
			}
			if (sum % 2 != 0)
				System.out.println("Sum of odd digits is odd");
			else
				System.out.println("Sum of odd digits is even");
		}
		else
			System.out.println("Please enter Valid number");
	}
}
