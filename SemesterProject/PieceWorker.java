//PieceWorker Class extends Employee

public class PieceWorker extends Employee
{
	private double wage;
	private int pieces;
	
	//constructor
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber,
	       double wage, int pieces)
		   {
			   super(firstName, lastName, socialSecurityNumber);
			   
			   if (wage < 0.0)
			   {
				   //validate wage
				   throw new IllegalArgumentException
				   ("Wage per piece must be >= 0.0");
			   }   
				   
				if (pieces < 0)
                {
					//validate pieces
					throw new IllegalArgumentException
					("Pieces produced must be >= 0");
				} 

                this.wage = wage;
                this.pieces = pieces; 				  
		    }
			
	//set wage
	public void setWage(double wage)
	{
		if (wage < 0.0)
		{
		   //validate wage
		   throw new IllegalArgumentException
			   ("Wage per piece must be >= 0.0");
        }

        this.wage = wage;		
	}
	
	//return wage
	public double getWage()
    {
		return wage;
	} 
	
	//set pieces
	public void setPieces(int pieces)
	{
		if (pieces < 0)
        {
        	//validate pieces
			throw new IllegalArgumentException
				("Pieces produced must be >= 0");
		} 
		
		this.pieces = pieces;
	}
	
	//return pieces
	public int getPieces()
	{
		return pieces;
	}
	
	//calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings()
	{
		return getPieces() * getWage();
	}
	
	//return String representation of PieceWorker object
	@Override
	public String toString()
	{
		return String.format("piece-worker: %s%n%s: $%,.2f; %s: %d",
		    super.toString(), "Wage-per-Piece", getWage(), "number of pieces produced", getPieces());
	}
	
}