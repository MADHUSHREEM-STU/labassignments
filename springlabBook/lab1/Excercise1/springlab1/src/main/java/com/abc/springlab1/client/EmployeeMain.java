package com.abc.springlab1.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springlab1.bean.Employee;



public class EmployeeMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee= (Employee) context.getBean("emp");
		employee.getEmployeeDetails();
		context.close();
		
	}

}
