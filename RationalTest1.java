//This program tests the class Rational to perform arithmetic operations

import java.util.Scanner;

public class RationalTest1
{
	public static void main(String[] args)
//Creating instances of the Rational class	
	{
		//Create a scanner object to read from user input
		Scanner input = new Scanner(System.in);
		
		//Define an object of type Rational to numerator and denomenator
		Rational rn1;
		Rational rn2;
		
		//get input from user
		System.out.println();
		System.out.println("Enter numerator for the first rational number");
		double numrn1 = input.nextDouble();
		
		System.out.println("Enter a non-zero denomenator for the first rational number");
		double denorn1 = input.nextDouble();
		
		System.out.println("Enter numerator for the second rational number");
		double numrn2 = input.nextDouble();
		
		System.out.println("Enter a non-zero denomenator for the second rational number");
		double denorn2 = input.nextDouble();
		
		rn1 = new Rational(numrn1, denorn1);
		rn2 = new Rational(numrn2, denorn2); 
		
		
//Displaying the fraction in string format
        
	   System.out.println();
	   System.out.println("Fraction1: " + rn1);
       System.out.println("Fraction2: " + rn2);

//Performing arithmetic operations

       System.out.printf("Sum of two Fractions is %s%n", rn1.add(rn2));
       System.out.printf("Difference of two Fractions is %s%n", rn1.subtract(rn2));
       System.out.printf("Product of two Fractions is %s%n", rn1.multiply(rn2));
       System.out.printf("Division of two Fractons is %s%n", rn1.divide(rn2));
       System.out.printf("Fraction one as Decimal: %.2f%n", Rational.toDecimal(rn1));
	   System.out.printf("Fraction two as Decimal: %.2f%n", Rational.toDecimal(rn2));
	}	
}