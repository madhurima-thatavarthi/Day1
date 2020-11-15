package com.main;

import java.util.Scanner;

import com.pojo.LargestWord;

public class LargestWordMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LargestWord largestword = new LargestWord();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String= ");
		String s1 = sc.nextLine();
		System.out.println("The largest word in the given sentence is = " + LargestWord.lengthiestString(s1));

		largestword = null;
		sc.close();
	}

}
