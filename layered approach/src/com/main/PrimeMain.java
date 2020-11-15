package com.main;

import java.util.Scanner;
import com.pojo.Prime;

public class PrimeMain {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Prime prime = new Prime();
		System.out.print("Enter a number =");
		int num1 = sc.nextInt();
		prime.setA(num1);
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0)
				count++;
		}
		if (count == 0)
			System.out.println(num1 + " is a prime number");
		else
			System.out.println(num1 + " is not a prime number");

		prime = null;
		sc.close();
	}

}
