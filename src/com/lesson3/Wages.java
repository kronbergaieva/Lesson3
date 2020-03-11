package com.lesson3;
import java.util.*;

public class Wages {
    // declare instance variables
    private String name;        private double salary;
    private double rate;
    private double netSalary;
    private double allowance;
    private double taxDue;
    private double taxable;       
    public static void main(String args[]){
        // declare and create objects
        Scanner sc = new Scanner(System.in);
        Wages myTax = new Wages();
        // get input from user
        System.out.print("Please enter your name : ");
        myTax.name = sc.next();                System.out.print("\nHi "+myTax.name+" can you please enter your salary : ");
        myTax.salary = sc.nextDouble();                System.out.print("\nThank you " +myTax.name+ " can you now enter the tax rate ie .45 or .24 :");
        myTax.rate = sc.nextDouble();               System.out.print("\nFinally " + myTax.name + " please enter your tax free allowance : ");
        myTax.allowance = sc.nextDouble();                //process
        myTax.taxable = myTax.calcTaxable(myTax.salary, myTax.allowance);
        myTax.taxDue = myTax.calcTaxDue(myTax.taxable, myTax.rate);
        myTax.netSalary = myTax.calcNetSal(myTax.salary, myTax.taxDue);         //output the bad news to the poor user
        System.out.println("\n\tHere's the bad news " + myTax.name + "\n"+
                "\tGross Salary = \t" + myTax.salary + "\n" +
                "\tAllowance = \t" + myTax.allowance + "\n" +
                "\t\t\t________\n"+
                "\tTaxable = \t" + myTax.taxable + "\n" +
                "\tRate = \t\t" + (myTax.rate*100) + "%\n" +
                "\tTax due = \t" + myTax.taxDue + "\n" +
                "\tNet Salary = \t" + myTax.netSalary + "\n");
    }
    // method to calculate amount taxable
    public double calcTaxable(double sal, double all){
        return sal - all;
    }    public double calcTaxDue(double txble, double rt){
        return txble * rt;
    }    public double calcNetSal(double sal,double txDue){
        return sal - txDue;
    }
}