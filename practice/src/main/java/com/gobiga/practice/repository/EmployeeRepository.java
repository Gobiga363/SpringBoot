package com.gobiga.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gobiga.practice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,String>{

}
