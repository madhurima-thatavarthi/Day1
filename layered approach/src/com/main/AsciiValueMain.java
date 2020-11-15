package com.main;

import java.util.Scanner;
import com.pojo.AsciiValue;

public class AsciiValueMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AsciiValue asciivalue = new AsciiValue();
		System.out.print("Enter a characater =");
		char ch = sc.next().charAt(0);
		asciivalue.setCh1(ch);
		int ascii1 = (int) ch;
		System.out.println("The ASCII value of " + ch + " is = " + ascii1);

		asciivalue = null;
		sc.close();

	}

}
