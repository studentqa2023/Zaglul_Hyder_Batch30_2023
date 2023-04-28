package com.practice;


public class PracticeCondition {
	
	String name = "Zaglul";
	
public void getCondition(String name){
	
	if(name.contains( "Zag")) {
		System.out.println("Found my name");

	}else {
		
		System.out.println("Not Found");
	}
}
	
	public static void main(String[] args) {
		
		
		PracticeCondition obj = new PracticeCondition();
		
		obj.getCondition("Zaglul");
		obj.getCondition("Zakir");
		obj.getCondition("Rezwan");
		
	}

}