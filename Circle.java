//This program calculates the area, circumference and diameter of 
//the circle. The radius is input from the user.

import java.util.Scanner;

public class Circle
{
	public static void main(String[] args)
	{
		//define local variables
		double radius, area, circumference, diameter;
		
		//define a scanner object to read the user input
		Scanner scanner = new Scanner(System.in);
						
		//ask the user to enter the radius of the circle
		System.out.print("Enter circle radius:  ");
		
		//read and store the radius to local variable
		radius = scanner.nextDouble();
		
		//Echo back the radius the user just entered
		System.out.printf("Radius of Circle = %.2f\n", radius);
		
		//Compute area of the circle given the input radius
		area = Math.PI * radius * radius;
		
		//Display the area
		System.out.printf("Area of Circle = %.2f\n", area);
		
		//Compute circumference of the circle given the input radius
		circumference = 2 * Math.PI * radius;
		
		//Display the circumference
		System.out.printf("Circumference of Circle = %.2f\n", circumference);
		
		//Compute diameter of the circle given the input radius
		diameter = 2 * radius;
		
		//Display the diameter
		System.out.printf("Diameter of Circle = %.2f\n", diameter);
	}
}