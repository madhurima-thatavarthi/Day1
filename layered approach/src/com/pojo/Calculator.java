package com.pojo;

public class Calculator {
	private int a;
	private int b;

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

	public int add() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

	public int mul() {
		return a * b;
	}

	public int div() {
		return a / b;
	}

	public int rem() {
		return a % b;
	}

}
