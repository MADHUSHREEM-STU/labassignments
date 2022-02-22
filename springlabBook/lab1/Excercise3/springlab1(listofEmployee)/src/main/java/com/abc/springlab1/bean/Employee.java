package com.abc.springlab1.bean;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
//	public void getEmployeeDetails() {
//		System.out.println("Employee details");
//		System.out.println("----------------");
//		System.out.println("Employee {empAge="+getAge()+", empId="+getEmployeeId()+", empName="+getEmployeeName()+", empSalary="+getSalary()+"}");
//		System.out.println("sbu details=SBU {sbuCode="+getBusinessUnit().getSbuId()+", sbuHead="+getBusinessUnit().getSbuHead()+", sbuName="+getBusinessUnit().getSbuName()+"}");
//	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
}
