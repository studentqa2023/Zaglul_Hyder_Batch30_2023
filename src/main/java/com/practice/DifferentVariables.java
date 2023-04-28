package com.practice;

public class DifferentVariables {
	
	int x = 45;
	
	public void getMoney() {
		
		int a =15;
		System.out.println(a);
	}

	public void getSalary() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		DifferentVariables obj = new DifferentVariables();
		
		obj.getMoney();
		obj.getSalary();
		
	}
}
