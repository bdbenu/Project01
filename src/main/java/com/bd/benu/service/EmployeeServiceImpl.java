package com.bd.benu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.benu.model.Employee;
import com.bd.benu.repo.EmployeeRepositary;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepositary employeeRepositary;

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepositary.save(employee);
	}

	@Override
	public List<Employee> employees() {
		
		return employeeRepositary.findAll();
	}

}
