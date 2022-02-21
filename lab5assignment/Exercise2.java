package capgeminipractice;

import java.util.*;

public class Exercise2 {
	public static void main(String[] args)
	{

		String firstName="hffrvn";
		String lastName="";
		String fullName=firstName.concat(" "+lastName);
			try 
			{
				if(firstName=="" || lastName=="") {
					throw new NameInvalidException("first name and last name should not be empty");
					}
				else
				{
					System.out.println("first name and last name filled successfully: "+fullName);
				}
				
			}
			catch(NameInvalidException e)
			{
				System.out.println(e.getMessage());
			}
	}

}


