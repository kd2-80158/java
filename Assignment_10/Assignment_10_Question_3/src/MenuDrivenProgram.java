import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MenuDrivenProgram {


	static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("************************");
		System.out.println("0. Exit");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Find Employee");
		System.out.println("4. Sort Employee");
		System.out.println("5. Edit/Update Employee");
		System.out.println("************************");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		List<Employee> employee = new LinkedList<Employee>();
		Employee e=null;
		int ch;
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				e = new Employee();
				e.accept();
				employee.add(e);
				break;
			case 2:
				System.out.println("Enter empid");
				int index = sc.nextInt();
				Employee key = new Employee();
				key.setEmpid(index);
				if(employee.contains(key))
				{
					employee.remove(key);
					System.out.println("Employee removed at index ");
				}
				else
				{
					System.out.println("No Employee found");
				}
				
				break;
			case 3:
				System.out.println("Enter empid to find: ");
				int find= sc.nextInt();
				Employee key1 = new Employee();
				key1.setEmpid(find);
				if(employee.contains(key1))
				{
					if(employee.contains(e))
					{
						System.out.println(e.toString());
					}
				}
				else
				{
					System.out.println("Employee not found");
				}
				break;
			case 4:
			Collections.sort(employee);
				for(Employee e1:employee)
				{
					System.out.println(e1.toString());
				}
				break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				Employee key2 = new Employee();
				key2.setEmpid(id);
				int index2 = employee.indexOf(key2);
				if(index2 == -1)
				    System.out.println("Employee not found.");
				else {
				    Employee oldEmp = employee.get(index2);
				    System.out.println("Employee Found: " + oldEmp);
				    System.out.println("Enter new information for the Employee");
				    Employee newEmp = new Employee();
				    newEmp.accept();
				    employee.set(index2, newEmp);
				}
				break;
			default:
				System.out.println("Wrong Input Entered.........");
				break;
			}
		}

	}

}
