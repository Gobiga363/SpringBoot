package com.gobiga.test.controller;

import org.springframework.web.bind.annotation.*;

import com.gobiga.test.model.Employee;
import com.gobiga.test.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("{employeeId}")
	public Employee getEmployeeDetails(@PathVariable("employeeId") String employeeId) {
		return employeeService.getEmployee(employeeId);
	}
	
	@PostMapping
	public String createEmployeeDetails(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return "Created Successfully";
	}
	
	@PutMapping
	public String updateEmployeeDetails(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return "Updated Successfully";
	}
	
	@DeleteMapping("{employeeId}")
	public String deleteEmployeeDetails(@PathVariable("employeeId") String employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "Deleted Successfully";
	}
	
}
