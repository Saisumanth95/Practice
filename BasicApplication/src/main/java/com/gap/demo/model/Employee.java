package com.gap.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	
	
	@Id
	private int empid;
	private String name;
	private String position;
	private String email;
	private String phoneno;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", position=" + position + ", email=" + email
				+ ", phoneno=" + phoneno + "]";
	}
	
	
	
	
	

}
