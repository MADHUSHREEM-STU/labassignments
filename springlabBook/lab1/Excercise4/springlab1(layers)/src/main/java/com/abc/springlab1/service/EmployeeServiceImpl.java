package com.abc.springlab1.service;

import com.abc.springlab1.bean.Employee;
import com.abc.springlab1.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService{

	public Employee getDetails(int empId) {
		EmployeeDao empDao=new EmployeeDao();
		return empDao.getDetails(empId);
	}
 
}