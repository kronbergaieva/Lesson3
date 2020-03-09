package com.lesson3;

public class MyClass {

	private int x = 5;
	
	//create a method
	public void myString(){
		System.out.println("Print me");
	}
	//create method with the parameters
	
	public void myNumber(int xNumber){
		System.out.println("xNumber is: " + xNumber);
	}
	
	public static void main(String[] args) {
		//create an object of type MyMlass
		MyClass myObj = new MyClass();
		
		System.out.println("X: " + myObj.x);
		myObj.myString();
		myObj.myNumber(44);

	}//end main

}//end class
