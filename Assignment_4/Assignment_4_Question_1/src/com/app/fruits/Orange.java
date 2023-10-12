package com.app.fruits;

	public class Orange extends Fruit 
	{
		
		public Orange()
		{
			this("",0,"Orange",true);
		}


		
		public Orange(String color, double weight, String name,boolean isFresh) 
		{
			super(color, weight, name,isFresh);
	
		}


		public String taste()
		{
			return "sour";
		}
		

		@Override
		public void acceptData() {
			System.out.println("Orange");
			super.acceptData();
		}

		@Override
		public void displayData() {
			super.displayData();
		}
	}