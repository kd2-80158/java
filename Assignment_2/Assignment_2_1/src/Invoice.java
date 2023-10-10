import java.util.Scanner;

public class Invoice {
	
	String partno;
	String partname;
	int quantity;
	double price;
	
	public Invoice()
	{
		this.partno="";
		this.partname="";
		this.quantity=0;
		this.price=0;
	}
	
	public Invoice(String partno, String partname, int quantity, double price) 
	{
		this.partno = partno;
		this.partname = partname;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getPartname() {
		return partname;
	}

	public void setPartname(String partname) {
		this.partname = partname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	Scanner sc = new Scanner(System.in);
	public void acceptData()
	{
		System.out.print("Enter partno: ");
		partno=sc.next();
		System.out.print("Enter Partname: ");
		partname=sc.next();
		System.out.print("Enter Quantity: ");
		  quantity=sc.nextInt();
		System.out.print("Enter Price: ");
		  price=sc.nextDouble();
		
	}
	public double calculate()
	{
		double amount=0;
		if(this.quantity<=0)
		  this.setQuantity(0);
		if(this.price<=0)
		  this.setPrice(0); 
		else
			 amount = (this.price*this.quantity);
		return amount;
	}
	public void displayData()
	{
		System.out.println("**********************");
		System.out.println("Part Number: "+partno);
		System.out.println("Part Name: "+partname);
		System.out.println("Quantity: "+quantity);
		System.out.println("Price: "+price);
		System.out.println("Total amount: "+calculate());
	}
	
    
}
