import java.util.Scanner;

public class Date {
	int day;
	int month;
	int year;
	
	public Date()
	{
		this.day = 0;
		this.month = 0;
		this.year = 0;		
	}
	public Date(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	Scanner sc = new Scanner(System.in);
	public void acceptDate()
	{
		System.out.print("Enter day: ");
		day = sc.nextInt();
		System.out.print("Enter month: ");
		month = sc.nextInt();
		System.out.print("Enter year: ");
		year = sc.nextInt();
	}
	public void displayDate()
	{
		System.out.println("**********************");
		System.out.println("Date is: "+this.day+"/"+this.month+"/"+this.year);
		System.out.println("**********************");
	}

}
