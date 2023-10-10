
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.acceptData();
		employee1.displayData();
		
		
		Employee employee2 = new Employee();
		employee2.acceptData();
		employee2.displayData();

        System.out.println("Employee "+employee1.getFileName()+" "+employee1.getLastName());
		employee1.increment();
		System.out.println("Employee "+employee2.getFileName()+" "+employee2.getLastName());
        employee2.increment();
	}

}
