package com.gobiga.test.service;

import java.util.List;

import com.gobiga.test.model.Employee;

public interface EmployeeService {

	public String createEmployee(Employee employee);
	public String updateEmployee(Employee employee);
	public String deleteEmployee(String employeeId);
	public Employee getEmployee(String employeeId);
	public List<Employee> getAllEmployee();
}
