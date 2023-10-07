import java.util.Scanner;

public class AverageOfDoubleType {

	public static void main(String[] args) {
		
//		double num1;
//		double num2;
		
		Scanner sc = new Scanner(System.in);
		
//		Double.valueOf(num1);
//		Double.valueOf(num1);
		System.out.print("Enter first number: ");

		
		if(sc.hasNextDouble() && sc.hasNextDouble()&&!sc.hasNextInt()&&!sc.hasNextInt())
			{
			
			double num1=sc.nextDouble();
			
			System.out.print("Enter second number: ");
			double num2=sc.nextDouble();
			double num3=(num1+num2)/2;
		    System.out.println("Sum of two number is: "+num3);
			}
		else
		{
			System.out.println("Please enter values of double type!");
		}

        sc.close();
	}

}
