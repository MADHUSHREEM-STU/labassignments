package com.abc.springlab1.bean;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit=businessUnit;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee details");
		System.out.println("----------------");
		System.out.println("Employee [empage=" +age+", empid="+employeeId+", empname= "+employeeName+", empsalay= "+salary+"businessUnit="+businessUnit);
		
	}
	
	
	
}
