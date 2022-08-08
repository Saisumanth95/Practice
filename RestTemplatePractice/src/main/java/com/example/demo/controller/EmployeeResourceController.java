package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeResourceController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/employee-client")
	 public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	
	@PostMapping("/employee-client/addAll")
	public List<Employee> saveAllEmployees(@RequestBody List<Employee> employees){
		return employeeService.addAllEmployees(employees);
	}
	
	@GetMapping("/employee-client")
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployees();
	}
	
	
	@GetMapping("/employee-client/{aid}")
	public Employee getEmployee(@PathVariable("aid") int aid) {
		return employeeService.getEmployee(aid);
	}
	
	
	@PutMapping("/employee-client/{aid}")
	public Employee updateEmployee(@PathVariable("aid") int aid, @RequestBody Employee employee) {
		return employeeService.updateEmployee(aid, employee);
	}
	
	@DeleteMapping("/employee-client/{aid}")
	public String deleteEmployee(@PathVariable("aid") int aid) {
		return employeeService.deleteEmployee(aid);
	}
	

}
