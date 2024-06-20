package com.gobiga.practice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.gobiga.practice.model.Employee;
import com.gobiga.practice.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	// get using Id

	@GetMapping("{employeeId}")
	public Employee getEmployeeDetails(@PathVariable("employeeId") String employeeId) {
		
		return employeeService.getEmployee(employeeId);
	}
	
	//get all
	
	@GetMapping()
	public List<Employee> getAllEmployeeDetails() {
		
		return employeeService.getAllEmployee();
	}
	
	
	@PostMapping
	public String createEmployeeDetails(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return "Created SuccessFully";
	}
	
	@PutMapping
	public String  updateEmployeeDetails(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return "Updated SuccessFully";
	}
	
	@DeleteMapping("{employeeId}")
	public String  deleteEmployeeDetails(@PathVariable("employeeId") String employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "Deleted SuccessFully";
	}
}
