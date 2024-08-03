package com.bd.benu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bd.benu.model.Employee;
import com.bd.benu.service.EmployeeService;
@CrossOrigin
@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/test")
	public String testApi() {
		return"API TESTED";
	}
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		return employeeService.createEmployee(employee);
	}
	@GetMapping("/employees")
	public List<Employee> employees(){
		return employeeService.employees();
	}

}
