import java.util.Objects;
import java.util.Scanner;

public class Employee implements Comparable<Employee>{
	
	private int empid;
	private String name;
	private double salary;
	
	Employee()
	{
		this(0,"",0.0);
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
         System.out.println("Enter empid: ");
         empid=sc.nextInt();
         System.out.println("Enter name: ");
         name=sc.next();
         System.out.println("Enter salary: ");
         salary=sc.nextDouble();

	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empid, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Employee)
		{
		Employee other = (Employee) obj;
		if(this.empid==other.empid)
	       return true;
	    }
        return false;

	    }
	@Override
	public int compareTo(Employee o) {
		int diff = this.empid-o.empid;
		return diff;
	}


}
