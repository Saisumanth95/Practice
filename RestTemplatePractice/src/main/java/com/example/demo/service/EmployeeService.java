package com.example.demo.service;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	
	
	@Autowired
	private RestTemplate restTemplate;
	

	
	public Employee saveEmployee(Employee employee) {
		
		HttpEntity<Employee> entity = new HttpEntity<>(employee);
		
		
		return restTemplate.exchange("http://localhost:8080/employees/add", HttpMethod.POST,entity,Employee.class).getBody();
	}

	
	public List<Employee> getAllEmployees(){
		
		return restTemplate.exchange("http://localhost:8080/employees", HttpMethod.GET,null,List.class).getBody();
	}
	
	
	public Employee updateEmployee(int aid,Employee employee) {
		
		HttpEntity<Employee> entity = new HttpEntity<>(employee);
		
		return restTemplate.exchange("http://localhost:8080/employees/"+aid, HttpMethod.PUT,entity,Employee.class).getBody();
	}
	
	
	public String deleteEmployee(int aid) {
		return restTemplate.exchange("http://localhost:8080/employees/"+aid, HttpMethod.DELETE,null,String.class).getBody();
	}
	
	
	public Employee getEmployee(int aid) {
		return restTemplate.exchange("http://localhost:8080/employees/"+aid, HttpMethod.GET,null,Employee.class).getBody();
	}
	
	public List<Employee> addAllEmployees(List<Employee> employees){
		
		HttpEntity<List<Employee>> entity = new HttpEntity<>(employees);
		
		return restTemplate.exchange("http://localhost:8080/employees", HttpMethod.POST,entity,List.class).getBody();
	}
	
	
}
