import java.util.Scanner;

public class CircleTest
{
	public static void main(String[] args)
	{
		//define local variables
		double radius, area, circumference, diameter;
		
		//define a scanner object to read the user input
		Scanner scanner = new Scanner(System.in);
		
		//define an object of type Circle to compute area circumference and diameter
		Circle c = new Circle();
		
		//ask the user to enter the radius of the circle
		System.out.print("Enter circle radius:  ");
		
		//read and store the radius to local variable
		radius = scanner.nextDouble();
		
		//Echo back the radius the user just entered
		System.out.printf("Radius of Circle = %.2f\n", radius);
		
		//Call area function to compute area of the circle given the input radius
		area = c.area(radius);
		
		//Display the area
		System.out.printf("Area of Circle = %.2f\n", area);
		
		//Call circumference function to compute circumference of the circle given the input radius
		circumference = c.circumference(radius);
		
		//Display the circumference
		System.out.printf("Circumference of Circle = %.2f\n", circumference);
		
		//Call diameter function to compute diameter of the circle given the input radius
		diameter = c.diameter(radius);
		
		//Display the diameter
		System.out.printf("Diameter of Circle = %.2f\n", diameter);
	}
	
}
