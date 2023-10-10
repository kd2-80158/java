package tester;

import com.app.geometry.*;

public class TestPoint {

	public static void main(String[] args)
	{
		Point2D point = new Point2D();
		point.acceptData();
		Point2D point1 = new Point2D();
		point1.acceptData();
		
		point1.calculateDistance(point);
		
		
		String detail = point.getDetails();
		String detail1 = point1.getDetails();
		
		System.out.println("Class field of obj1");
		System.out.println("(x,y): "+detail);
		System.out.println("Class field of obj2");
		System.out.println("(x,y): "+detail1);
		boolean find = point1.isEqual(point);
		System.out.println(find);
	}

}