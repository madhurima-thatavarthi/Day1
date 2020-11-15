package com.main;

import com.pojo.Average;
import java.util.Scanner;

public class AverageMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Average average=new Average();
		System.out.print("Enter first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter second number:");
		int num2 = sc.nextInt();
		System.out.print("Enter third number:");
		int num3 = sc.nextInt();
		average.setA(num1);
		average.setB(num2);
		average.setC(num3);
		average.display();
		
		average=null;
		sc.close();
	}

}
