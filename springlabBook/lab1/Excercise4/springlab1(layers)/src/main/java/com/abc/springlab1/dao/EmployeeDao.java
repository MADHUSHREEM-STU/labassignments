package com.abc.springlab1.dao;

import java.util.List;

import com.abc.springlab1.bean.Employee;

public class EmployeeDao {
	
	private static List<Employee> empList;
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
		System.out.println(this.empList);
	}
	public Employee getDetails(int empId){
		for(Employee data:empList){
			if(data.getEmployeeId()==empId)
				return data;
		}
		return null;
	}

}
