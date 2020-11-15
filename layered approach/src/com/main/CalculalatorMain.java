package com.main;

import com.pojo.Calculator;
import java.util.Scanner;

public class CalculalatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.print("Input first number:");
		int num1 = sc.nextInt();
		System.out.print("Input second number:");
		int num2 = sc.nextInt();
		calculator.setA(num1);
		calculator.setB(num2);

		System.out.println("Addition=" + calculator.add());
		System.out.println("subtraction=" + calculator.sub());
		System.out.println("Multiplication=" + calculator.mul());
		System.out.println("Division=" + calculator.div());
		System.out.println("Remainder=" + calculator.rem());
		calculator = null;
		sc.close();
	}

}
