//This program tests the encrypt() and decrypt() methods 

import java.util.Scanner;

public class CryptographyTest
{
    public static void main(String[] args)
	{	 
        //create a scanner object to read from user input
		Scanner sc = new Scanner(System.in);
		//define an object of type Cryptography to encrypt and decrypt
	    Cryptography Encryption = new Cryptography();
		
		int input = requestInput("Enter a 4 digit number for Encryption: ", sc);

        while (Encryption.validate(input) != true)
        {
			   input = requestInput("Enter a 4 digit number for Encryption: ", sc);
		}			
		
		String encryptNumber = "" + Encryption.encrypt(input);
				
				//add zeros at start of number if needed
				int len = encryptNumber.length();
				for(int i=4;i>len;i--)
				{
					encryptNumber = "0" + encryptNumber;				
				}
        
	    int encrypted = Encryption.encrypt(input);
        int decrypted = Encryption.decrypt(encrypted);	
		   
		System.out.println("Encrypted: " + encryptNumber);      
        System.out.println("Decrypted: " + decrypted);				
    }     				
		 
		public static int requestInput(String s, Scanner sc)
		{
			System.out.print(s);
			return sc.nextInt();
		}
}	 