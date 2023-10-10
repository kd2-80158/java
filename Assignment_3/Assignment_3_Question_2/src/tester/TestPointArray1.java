package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	
	public static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************************************************");
		System.out.println("1. Display details of a specific point");
		System.out.println("2. Display x,y cordinates of all points");
		System.out.println("3. User i/p: 2 indices for the points, validate the indices");
		System.out.println("4. Exit");
		System.out.println("*************************************************************");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		
		int ch;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		
	Point2D[] points=new Point2D[size];
    
	for(int i=0;i<points.length;i++)
	{
		points[i] = new Point2D();
	}
	
    
    while((ch=menu())!=4)
    {
    	switch(ch)
    	{
    	case 1:
    		break;
    	case 2:
    		break;
    	case 3:
    		break;
    	default:
    		System.out.println("Invalid choice!!!!!");
    		break;
    			
    	}
    }
    System.out.println("Thanks for using this application!!!");
}

}
