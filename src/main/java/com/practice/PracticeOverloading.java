package com.practice;

public class PracticeOverloading {
	public void getJob() {
		System.out.println("This is the first method");
		
	}
	public void getJob1(int a, int b, int c) {
		System.out.println("This is the second method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public void getJob1(int a, String b, int c) {
		
	}
	public void getJob1(int a, int b) {
		
	}
	public void getJob1(int a, int c, String b) {
		
	}

}
