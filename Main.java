package business;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		

		final int numberOfSymbols = 20;
		
		String retVal = "";
		
		/*
		 * 48 - 57 => 0 - 9
		 * 65 - 89 => A - Z
		 * 97 - 122 => a - z
		 * 
		 */
		char ch;	
		
		
		int randomInt;
		for(int i = 0; i< numberOfSymbols;) {
			//create random number 
			randomInt = new Random().nextInt(123);
			
			if
			(
					(
							(randomInt >= 48 )&&
							(randomInt <= 57)
					) 
					||
					(
							(randomInt >= 65 )&&
							(randomInt <= 89)
					)
					||
					(
							(randomInt >= 97 )&&
							(randomInt <= 122)
					)
			) 
			{
				 i++;
				 ch = (char)randomInt;
				 retVal += ch;				 
			}
		}
		System.out.println(retVal);
		
		
	}

}
