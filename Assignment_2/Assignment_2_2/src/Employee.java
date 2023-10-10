import java.util.Scanner;

public class Employee {
	
	String firstName;
	String lastName;
	double salary;
	
	public Employee()
	{
		this.firstName ="";
		this.lastName ="";
		this.salary =0;
	}
	
	public Employee(String fileName, String lastName, double salary) {

		this.firstName = fileName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFileName() {
		return firstName;
	}

	public void setFileName(String fileName) {
		this.firstName = fileName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	Scanner sc = new Scanner(System.in);
	
	public void acceptData()
	{
		System.out.print("Enter first name: ");
		firstName=sc.next();
		System.out.print("Enter last name: ");
		lastName=sc.next();
		System.out.print("Enter salary: ");
		salary=sc.nextDouble();
		if(salary<0)
		  this.setSalary(0);
		else
		  this.setSalary(salary);
	}

	public void increment()
	{
		double increment=0;
		increment = salary*12+ salary*12*0.10;
		System.out.println("Salary after increment: "+increment);
	}
	public void displayData()
	{
		System.out.println("************************");
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Salary: "+salary*12);
		System.out.println("*************************");
	}
}
