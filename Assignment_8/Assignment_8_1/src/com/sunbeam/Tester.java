package com.sunbeam;

class Box<T extends Employee>
{
   private T obj;

public T getObj() {
	return obj;
}

public void setObj(T val) {
	this.obj = val;
}
  public float getTotalSalary()
  {
	  return obj.calculateTotalSalary();
  }

}

public class Tester {

	public static void main(String[] args) {
		
//		Manager m = new Manager();
//		m.accept();
//		m.display();
		
//		Salesman s = new Salesman();
//		s.accept();
//		s.display();
		
		SalesManager sm = new SalesManager();
		sm.accept();
		sm.display();
		
		
//		Box<Manager> b1 = new Box();
//		b1.setObj(m);
//		System.out.println("Total salary: "+b1.getTotalSalary());
		
//		Box<Salesman> b2 = new Box();
//		b2.setObj(s);
//		System.out.println("Total salary: "+b2.getTotalSalary());
		
		Box<SalesManager> b3 = new Box();
		b3.setObj(sm);
		System.out.println("Total salary: "+b3.getTotalSalary());
		
		

	}

}
