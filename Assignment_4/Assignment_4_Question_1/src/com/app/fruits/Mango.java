package com.app.fruits;

public class Mango extends Fruit 
{
	
	public Mango()
	{
		this("",0,"Mango",true);
	}

	public Mango(String color, double weight, String name,boolean isFresh) {
		super(color, weight, name,isFresh);

	}
	
	public String taste()
	{
		return "sweet";
	}
	

	@Override
	public void acceptData() {
		super.acceptData();
	}

	@Override
	public void displayData() {
		super.displayData();
	}
}