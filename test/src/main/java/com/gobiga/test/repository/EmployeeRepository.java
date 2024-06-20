package com.gobiga.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gobiga.test.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,String> {

}
