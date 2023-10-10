package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	
	int x_axis;
	int y_axis;
	
	public Point2D()
	{
		x_axis = 0;
		y_axis = 0;
	}

	public Point2D(int x_axis, int y_axis) {

		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}
	public String getDetails()
	{
		String x = Integer.toString(x_axis);
		String y = Integer.toString(y_axis);
		String z = "("+x+","+y+")";
		return z;
	}
	public boolean isEqual(Point2D point)
	{
		if(this.x_axis==point.x_axis && this.y_axis==point.y_axis)
		   return true;
		else 
		   return false;
	}
	Scanner sc = new Scanner(System.in);
	
	public void acceptData()
	{
		System.out.print("Enter x_axis: ");
		x_axis = sc.nextInt();
		System.out.print("Enter y_axis: ");
		y_axis = sc.nextInt();
		
	}
	public void calculateDistance(Point2D point)
	{
		if(this.x_axis==point.x_axis && this.y_axis==point.y_axis)
		{
			return;
		}
		else
		{
		double result;
		result = ((this.x_axis-point.x_axis)*(x_axis-point.x_axis) + (y_axis-point.y_axis)*(y_axis-point.y_axis));
		double ans = Math.sqrt(result);
		System.out.println("Distance between two points: "+ans);
		}
	}



}
