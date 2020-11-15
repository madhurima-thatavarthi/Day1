package com.pojo;

public class Average {
	private float a;
	private float b;
	private float c;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public void display() {
		System.out.println("Average of three numbers =" + ((a + b + c) / 3));
	}

}
