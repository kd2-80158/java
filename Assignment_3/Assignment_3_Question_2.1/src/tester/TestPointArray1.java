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
//		System.out.print("Enter x cordinates: ");
//		x=sc.nextInt();
//		System.out.print("Enter y cordinates: ");
//		y=sc.nextInt();
		points[i] = new Point2D();
		System.out.println("Enter x and y cordinates for index "+i);
		points[i].acceptData();
	}
	
    
    while((ch=menu())!=4)
    {
    	switch(ch)
    	{
    	case 1:
    		int choice1;
    		System.out.println("Enter the index: ");
    		choice1=sc.nextInt();
    		if(choice1>=0 && choice1<points.length)
    			System.out.println("Display x and y co-ordinates:" +points[choice1].getDetails());
    		else
    			System.out.println("Invalid index, please retry!!!");
    			
    		break;
    	case 2:
    		for(Point2D element:points)
    			System.out.println(element.getDetails());
    		break;
    	case 3:
    		int index,index1;
    		System.out.println("Enter the starting index");
    		index=sc.nextInt();
    		System.out.println("Enter the end index");
    		index1=sc.nextInt();
    		

    		if(index>=0 && index<points.length && index1>=0 && index1<points.length)
    			
    		    
    			points[index].calculateDistance(points[index1]);
    		
    		else
    			System.out.println("Invalid index!!!!");

//    		boolean find = isEqual(points);
//    		System.out.println(find);
//    		
//    		points.calculateDistance(Point2D point);
    		break;
    	default:
    		System.out.println("Invalid choice!!!!!");
    		break;
    			
    	}
    }
    System.out.println("Thanks for using this application!!!");
}

}
