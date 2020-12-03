//This program creates a class Rational for performing addition, 
//subtraction, multiplication, division and return a string
//in the form of a/b and to represent the fractions as decimals.
//Before performing arithmetic with fractions, the reduced form of
//the fraction is used.

class Rational
{
	private double numerator;
	private double denominator;
	
//constructor with parameters	
	public Rational(double numerator, double denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
		
		simplify();
	}
	
//initialization of numerator and denominator	
	public Rational()
	{
		numerator = 1;
		denominator = 1;
	}
	
//Accessor method for Numerator	
	public double getNumerator()
	{
		return numerator;
	}
	
	public void setNumerator(double numerator)
	{
		this.numerator = numerator;
	}
	
//Accessor method for denominator		
	public double getDenominator()
	{
		return denominator;
	}
	
	public void setDenominator(double denominator)
	{
		this.denominator = denominator;
	}
	
//Method to find reciporcal	
    public Rational	reciprocal()
	{
       return new Rational(denominator, numerator);
	}
	
//Method to add the rational numbers. 
	public Rational add(Rational num2)
	{
	   double commonDenominator = denominator * num2.getDenominator();
       double numerator1 = numerator * num2.getDenominator();
       double numerator2 = num2.getNumerator() * denominator;
       double sum = numerator1 + numerator2;

       return new Rational(sum, commonDenominator);
	}
	
//Method to subtract the rational numbers. 
    public Rational subtract(Rational num2)
    {
	   double commonDenominator = denominator * num2.getDenominator();
       double numerator1 = numerator * num2.getDenominator();
       double numerator2 = num2.getNumerator() * denominator;
       double difference = numerator1 - numerator2;

       return new Rational(difference, commonDenominator);
	}

//Method to multiply the rational numbers. 
    public Rational multiply(Rational num2)
	{
       double numer = numerator * num2.getNumerator();
       double denom = denominator * num2.getDenominator();

       return new Rational(numer, denom);
	}	
	
//Method to divide the rational numbers.
    public Rational divide(Rational num2)
    {
       return multiply(num2.reciprocal());	
	}
	
//Method to reduce the fraction and to get the gcd	
	public void simplify()
	{
		double highest;
		
		if (numerator > denominator)
			highest = numerator;
		else
			highest = denominator;
		
		int j = 2;
		while(j < highest)
		{
			if (numerator > denominator)
				highest = numerator;
			else
				highest = denominator;
		
		if (numerator % j == 0 && denominator % j == 0)
		{
			numerator = numerator/j;
			denominator = denominator/j;
			j = 2;
			continue;
		}
	    j++;
		}
	}
	
//Returns String representation of the fraction	
	@Override
	public String toString()
	{
		return this.numerator + "/" + this.denominator;
	}
	
//Method to return the fraction in the form of a decimal	
	public static double toDecimal(Rational num2)
	{
		return (double) num2.numerator / num2.denominator;
	}
}