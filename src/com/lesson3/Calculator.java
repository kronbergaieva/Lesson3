package com.lesson3;
//perform simple calculation using methods
//declare class calculator
public class Calculator {
	//declare instance variables to store result of 
	private double result;
	
	//declare a method CALLED add - each method describes behaviour/ task
	//with two parameterss
	public void add(double numberOne, double numberTwo){
		//add value numberOne and numberTwo and store in instance varia....
		result = numberOne + numberTwo;
		//display
		System.out.println(numberOne + " +" + numberTwo + "=" + result);
	}//ends the body of add method
	
	public static void main(String[] args) {
		//reuse the Calculator class
		//declare a variable of type of Calculator
		Calculator calc;
		calc = new Calculator();
		
		calc.add(12.6, 18.8);
		
	}//end method

}//end class