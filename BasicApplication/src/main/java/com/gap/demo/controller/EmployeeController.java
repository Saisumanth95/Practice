package com.gap.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gap.demo.dao.EmployeeRepo;
import com.gap.demo.model.Employee;

import java.util.*;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	
	@GetMapping("/employees")
	List<Employee> getAll(Employee em){
		return repo.findAll();
	}
	
	@GetMapping("/employees/{aid}")
	Employee getEmployee(@PathVariable("aid") int aid) {
		return repo.findById(aid).orElse(new Employee());
	}
	
	
	@PostMapping("/employees/add")
	Employee addEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}
	
	
	
	@PutMapping("/employees/{aid}")
	Employee updateEmployee(@PathVariable("aid") int aid, @RequestBody Employee employee) {
		
		Employee employeeDetails = repo.findById(aid).orElse(new Employee());
		
		employeeDetails.setEmail(employee.getEmail());
		employeeDetails.setName(employee.getName());
		employeeDetails.setPhoneno(employee.getPhoneno());
		employeeDetails.setPosition(employee.getPosition());
		
		
		return repo.save(employeeDetails);
	}
	
	
	@DeleteMapping("/employees/{aid}")
	String deleteEmployee(@PathVariable("aid") int aid)	{
		
		Employee employee = repo.findById(aid).orElse(new Employee());
		
		repo.delete(employee);
		
		return "Employee deleted";
		
	}
	
	@PostMapping("/employees")
	List<Employee> addAll(@RequestBody List<Employee> employeeList){
		
		for(Employee emp : employeeList) {
			repo.save(emp);
		}
		
		return repo.findAll();
	}
	
	
	
	

}
