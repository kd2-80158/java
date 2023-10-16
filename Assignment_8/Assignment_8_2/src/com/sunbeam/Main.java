package com.sunbeam;

class Box<T>
{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T val) {
		this.obj = val;
	}
	
	
}

public class Main {
	
	public static void printDisplayableBox(Box<? extends Displayable>b)
	{ 
		
		b.getObj().show();
		
	}
	public static void printAnyBox(Box<?> b)
	{
		System.out.println(b.getObj().toString());
	}

	public static void main(String[] args) {
      
		Box<Person> p1 = new Box<>();
	    p1.setObj(new Person("saurabh",25));
	    printDisplayableBox(p1);

	    
		Box<Date> p2 = new Box<>();
	    p2.setObj(new Date(1,4,2024));
	    printDisplayableBox(p2);
	    
	}

}
