package com.main;

import java.util.Scanner;
import com.pojo.checkSum;

public class checkSumMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		checkSum checksum = new checkSum();
		System.out.println("Enter a digit= ");
		int num1 = sc.nextInt();
		checksum.setA(num1);
		checkSum.display();

		checksum = null;
		sc.close();

	}

}
