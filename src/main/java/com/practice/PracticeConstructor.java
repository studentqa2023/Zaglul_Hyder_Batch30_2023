package com.practice;

public class PracticeConstructor {
	
	int a = 10;
	int b = 20;
	
	public PracticeConstructor(int x, int y) {
		
		this.a=x;
		this.b=y;
		
		System.out.println(x);
		System.out.println("This is summation = "+(x+y));
		
		System.out.println("This is constructor");
	}
	public static void main(String[] args) {
		
		PracticeConstructor obj = new PracticeConstructor(10, 20);
		
	
	}

}
