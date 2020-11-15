package com.main;

import java.util.Scanner;
import com.pojo.sumOfSquaresOfEvenDigits;

public class sumOfSquaresOfEvenDigitsMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("unused")
		sumOfSquaresOfEvenDigits sumofsquaresofevendigits=new sumOfSquaresOfEvenDigits();
		System.out.print("Enter a digit =");
		int num1=sc.nextInt();
		sumOfSquaresOfEvenDigits.setA(num1);
		System.out.println(sumOfSquaresOfEvenDigits.display());
		
		sumofsquaresofevendigits=null;
		sc.close();
	}

}
