//This program creates a Cryptography class that takes in four integers and
//uses two methods. One, encrypt method to encrypt the numbers and two, decrypt 
//method to decrypt the numbers to their original order

public class Cryptography
{
	// ensure number is of length 4
           public boolean validate(int input)
		   {
           return (Integer.toString(input).length() == 4) ? true : false;
		   }
		   
	public int encrypt(int input)
	{ 
	   // input is 4 digit integer
       // convert integer to string
      String str = "" + input;
	   
       // add zeroes at start of number if needed
       int len = str.length();
       for(int i=4;i>len;i--) 
	   {
          str = "0" + str;
       }
	   
		//get Individual Digits
		int firstNumber = str.charAt(0)- '0'; // remove '0' to covert char to digit
		int secondNumber = str.charAt(1)-'0';
		int thirdNumber = str.charAt(2)-'0';
		int fourthNumber = str.charAt(3)- '0';
		
		//add 7 to each digit and take remainder by dividing 10
		firstNumber = (firstNumber + 7) % 10;
		secondNumber = (secondNumber + 7) % 10;
		thirdNumber = (thirdNumber + 7) % 10;
		fourthNumber = (fourthNumber + 7) % 10;
		
		//replace the first digit with third and second with fourth
		String encryptNumber = "" + thirdNumber + fourthNumber + firstNumber + secondNumber;
		
		//convert string to integer and return it
		return Integer.parseInt(encryptNumber);
	}	
	public static int decrypt(int input)
	{
		// input is 4 digit integer
       // convert integer to string
       String str = "" + input;
	   
       // add zeroes at start of number if needed
       int len = str.length();
       for(int i=4;i>len;i--) 
	   {
           str = "0" + str;
       }
	   
		//get Individual Digits
		int firstNumber = str.charAt(0)-'0'; // remove '0' to covert char to digit
		int secondNumber = str.charAt(1)-'0';
		int thirdNumber = str.charAt(2)-'0';
		int fourthNumber = str.charAt(3)- '0';
		
		//add 10 to each digit and subtract 7 take remainder by dividing 10
		firstNumber = ((firstNumber + 10) - 7) % 10;
		secondNumber = ((secondNumber + 10) - 7) % 10;
		thirdNumber = ((thirdNumber + 10) - 7) % 10;
		fourthNumber = ((fourthNumber + 10) - 7) % 10;
		
		//replace the first digit with third and second with fourth
		String encryptNumber = "" + thirdNumber + fourthNumber + firstNumber + secondNumber;
		
		//convert string to integer and return it	
		return Integer.parseInt(encryptNumber);
	}    	
}			