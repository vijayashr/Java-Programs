//This program tests the class Rational to perform arithmetic operations

public class RationalTest
{
	public static void main(String[] args)
//Creating instances of the Rational class	
	{
		Rational rn1 = new Rational(25, 35);
		Rational rn2 = new Rational(10, 4);
		
//Displaying the fraction in string format
        
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