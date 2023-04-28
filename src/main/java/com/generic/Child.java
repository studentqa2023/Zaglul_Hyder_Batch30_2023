package com.generic;

import com.practice.Father;


public class Child extends Father {
	
	public static void main(String[] args) {
		
		Father obj = new Child();
		
		obj.getMoney();
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}
	
}
