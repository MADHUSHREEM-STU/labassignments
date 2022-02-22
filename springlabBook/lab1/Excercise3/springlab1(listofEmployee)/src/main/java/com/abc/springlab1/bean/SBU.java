package com.abc.springlab1.bean;

import java.util.List;

public class SBU {
	private int sbuCode;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	public int getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public void getSBUEmployeeDetails() {
		System.out.println("SBU Details");
		System.out.println("----------------------------");
		System.out.println("sbuCode="+getSbuCode()+", sbuHead="+getSbuHead()+", sbuName="+getSbuName());
		System.out.println("Employee Details:----------------");
		System.out.print("[");
		List<Employee> emp=getEmpList();
		for(Employee data:emp){
			System.out.print("Employee [");
			System.out.print("empId="+data.getEmployeeId()+", ");
			System.out.print("empName="+data.getEmployeeName()+", ");
			System.out.print("empSalary="+data.getSalary()+"]");
			if(emp.indexOf(data)!=emp.size()-1){
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
}
