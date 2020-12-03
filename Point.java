//This program calculates the distance between two points (x1,y1)
//and (x2,y2). The coordinates are entered by the user.

import java.util.Scanner;

public class Point
{
	public static void main(String[] args)
	{
		//initializing the variables
		double x1;
		double x2;
		double y1;
		double y2;
		double distance;
		
		//Obtain the coordinates from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 coordinate");
		x1 = input.nextDouble();
		System.out.println("Enter y1 coordinate");
		y1 = input.nextDouble();
		System.out.println("Enter x2 coordinate");
		x2 = input.nextDouble();
		System.out.println("Enter y2 coordinate");
		y2 = input.nextDouble();
		
		//The coordinates and the distance are printed
		distance = calculateDistance(x1,y1,x2,y2);
		System.out.println("The distance between two points "+"("+x1+","+y1+") and ("+x2+","+y2+") is "+distance);
	}		
	    //This module calculates and retuns the distance
		public static double calculateDistance(double x1, double y1, double x2, double y2)
		{
		  return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		}  
}