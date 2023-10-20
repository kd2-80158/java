package com.sunbeam;

import java.util.Scanner;

interface Arithmetic
{
	double calc(double x, double y);
}

public class ArithmeticCalculator {
	
	
	static void calculate(double num1, double num2, Arithmetic op) {
	    double result = op.calc(num1, num2);
	    System.out.println("Result: "+result);
			}
    static int menu()
    {
    	Scanner sc = new Scanner(System.in);
    	int choice;
    	System.out.println("*******************");
    	System.out.println("0. Exit");
    	System.out.println("1. Addition");
    	System.out.println("2. Subtraction");
    	System.out.println("3. Multiplication");
    	System.out.println("4. Division");
    	System.out.println("*******************");
    	System.out.print("Enter your choice: ");
    	choice= sc.nextInt();
    	return choice;
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				System.out.println("Enter two values to add: ");
				double x= sc.nextDouble();
				double y= sc.nextDouble();
				calculate(x,y, (r,s) -> r+s);
				
				
				break;
			case 2:
				System.out.println("Enter two values to subtract: ");
				double x1= sc.nextDouble();
				double y1= sc.nextDouble();
				calculate(x1,y1, (r,s) -> r-s);
				break;
			case 3:
				System.out.println("Enter two values to multiply: ");
				double x2= sc.nextDouble();
				double y2= sc.nextDouble();
				calculate(x2,y2, (r,s) -> r*s);
				break;
			case 4:
				System.out.println("Enter two values to division: ");
				double x3= sc.nextDouble();
				double y3= sc.nextDouble();
				calculate(x3,y3, (r,s) -> r/s);
				break;
			default:
				System.out.println("Wrong choice...");
				break;
			}
		}
		
	
	}
}
