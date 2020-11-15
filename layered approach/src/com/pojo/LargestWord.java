package com.pojo;

import java.util.StringTokenizer;

public class LargestWord {
	private static String str;

	public static String getStr() {
		return str;
	}

	public static void setStr(String str) {
		LargestWord.str = str;
	}

	public static String lengthiestString(String s1) {
		int max = 0;
		String s2 = new String();
		StringTokenizer t = new StringTokenizer(s1, " ");
		while (t.hasMoreTokens()) {
			String s3 = t.nextToken();
			int n = s3.length();
			if (n > max) {
				max = n;
				s2 = s3;
			}
		}
		return s2;
	}
}
