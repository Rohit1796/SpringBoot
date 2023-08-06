package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	// Design restful web services to Store employee data into database
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		Employee svemp=employeeService.saveEmployee(employee);
		return svemp;
	}
	
}
