package com.abc.springlab1.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springlab1.bean.SBU;



public class EmployeeMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		SBU sbu=context.getBean("sbu",SBU.class);
		sbu.getSBUEmployeeDetails();
	}

}
