import java.util.Scanner;

public class Customers {
	
	int accno;
	int balance;
	int itemTotal;
	int totalCredit;
	int creditLimit;
	public Customers()
	{
		creditLimit = 20000;
	}
	public Customers(int accno, int balance, int itemTotal, int totalCredit, int creditLimit) {
		this.accno = accno;
		this.balance = balance;
		this.itemTotal = itemTotal;
		this.totalCredit = totalCredit;
		this.creditLimit = creditLimit;
	}
	Scanner sc = new Scanner(System.in);
	public void acceptData()
	{
		System.out.println("Enter accno: ");
		accno = sc.nextInt();
		System.out.println("Enter balance: ");
		balance = sc.nextInt();
		System.out.println("Enter itemTotal: ");
		itemTotal = sc.nextInt();
		System.out.println("Enter totalCredit: ");
		totalCredit = sc.nextInt();
//		System.out.println("Enter creditLimit: ");
//		creditLimit = sc.nextInt();
	}
	public int newBalance()
	{
		int newBalance=0;
		newBalance = balance+itemTotal-totalCredit;
		if(newBalance>creditLimit)
			System.out.println("Credit Limit Exceeded");
		else
			System.out.println("New Balance: "+newBalance);
		return newBalance;	
	}
//	public void displayData()
//	{
//		System.out.println("Accno: "+this.accno);
//		System.out.println("Balance: "+this.balance);
//		System.out.println("Item total: "+this.itemTotal);
//		System.out.println("Total credit: "+this.totalCredit);
//		System.out.println("Credit Limit: "+this.creditLimit);
//
//	}
	
	

}
