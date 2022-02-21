package com.cg.eis.exception;

import java.util.Scanner;

public class Exercise3 {
	 public static void main(String[] args)
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the salary of the employee");
		 double salary=scan.nextDouble();
		 if(!(salary<3000))
		 {
			 System.out.println("Employee salary is greater than 3000");
		 }
		 else
		 {
			 try
			 {
				 throw new EmployeeException("Employee salary is than than 3000");
			 }
			 catch(EmployeeException e){
				 System.out.println(e.getMessage());
			 }
		 }
		 
	 }

}
