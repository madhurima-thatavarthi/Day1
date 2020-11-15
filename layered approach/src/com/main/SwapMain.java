package com.main;

import java.util.Scanner;
import com.pojo.Swap;

public class SwapMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Swap swap = new Swap();
		System.out.print("Before swapping values are=");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		swap.setA(num1);
		swap.setB(num2);
		System.out.print("After swapping values are=");
		swap.display();

		swap = null;
		sc.close();
	}

}
