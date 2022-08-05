package com.gap.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gap.demo.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
