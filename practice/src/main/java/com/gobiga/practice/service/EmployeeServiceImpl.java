package com.gobiga.practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gobiga.practice.model.Employee;
import com.gobiga.practice.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public String createEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Success";
	}

	@Override
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Success";
	}

	@Override
	public String deleteEmployee(String employeeId) {
		employeeRepository.deleteById(employeeId);
		return "Success";
	}

	@Override
	public Employee getEmployee(String employeeId) {
		
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	
}
