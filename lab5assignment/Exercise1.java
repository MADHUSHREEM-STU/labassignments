package capgeminipractice;

import java.util.*;

public class Exercise1 {
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter age of the person");
int age=scan.nextInt();
scan.close();
if(age>15)
{
	System.out.println("not a childlabour, you can work in industry");
}
else
{
	try{
	throw new AgeInvalidException("working in this age is called as child labour and it is 13 against to law ");
	}
	catch(AgeInvalidException e)
	{
		System.out.println(e.getMessage());
	}
}
}
}
