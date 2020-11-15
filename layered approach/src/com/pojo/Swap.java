package com.pojo;

public class Swap {
	private int a;
	private int b;
	private int temp;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void display() {
		temp = a;
		a = b;
		b = temp;
		System.out.println(a + "\t" + b);
	}
}
