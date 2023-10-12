package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
//	public Fruit()
//	{
//		this.color = "";
//		this.weight =0;
//		this.name = "";
//		this.isFresh = true;
//	}
	
	public Fruit(String color, double weight,String name,boolean isFresh) {

		this.color = color;
		this.weight = weight;
		this.name=name;
		this.isFresh = isFresh;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public boolean getIsFresh()
	{
		return isFresh;
	}

	public String taste()
	{
		return "no specific taste";
	}
	Scanner sc = new Scanner(System.in);
	
	public void acceptData()
	{
		System.out.println("Enter color: ");
		color=sc.next();
		System.out.println("Enter weight: ");
		weight=sc.nextDouble();
		isFresh();
	}
	
	public void displayData()
	{
		System.out.println("Color: "+color);
		System.out.println("Weight: "+weight);
		System.out.println("Name: "+name);
		
	}
	

	public boolean isFresh()
	{
		System.out.println("Is the fruit fresh?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int result = sc.nextInt();
		if(result==1)
	      this.isFresh=true;
		else
		  this.isFresh=false;
		
		if(this.isFresh)
		  return true;
		else
		 return false;
		
		
	}

}
