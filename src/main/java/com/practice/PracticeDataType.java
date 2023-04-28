package com.practice;	// voice 20221019_603

public class PracticeDataType {
	
	int a;
	boolean b;
	long c;
	double d;
	short e;
	float f= 5;
	String s = "Hello";
	byte aa;
	char p;
	
		
		public void getMoney() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(aa);
		System.out.println(p);
		System.out.println(s);
	}
		
		public static void main(String[] args) {
			
			PracticeDataType obj = new PracticeDataType();
			
			obj.getMoney();
		}

}
