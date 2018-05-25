package com.jpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.model.Employee;
import com.jpa.demo.service.IEmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	
	@GetMapping("/test")
	public String test() {
		return"code working fine";
	}
	
	@PostMapping("/commit")
	public void saveEmployee(@RequestBody Employee emp) {
		service.saveEmployee(emp);
		
	}

}
