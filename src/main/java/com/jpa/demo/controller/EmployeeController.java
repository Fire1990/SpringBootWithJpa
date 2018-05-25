package com.jpa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PostMapping("/save")
	public void saveEmployee(@RequestBody Employee emp) {
		service.saveEmployee(emp);
		
	}
	
	/*@PostMapping("/bulk")
	public void saveMultipalEmployee(@RequestBody Employee emp) {
		service.saveEmployees(Collection<Employee> emp);
		
	}*/
	
	@DeleteMapping("/delete/{empId}")
	public void deleteEmployeeById(@PathVariable Long empId) {
		service.deleteEmployeeById(empId);
		
	}
	@DeleteMapping("/delete")
	public void deleteAllRecord() {
		service.deleteAllEmployees();
	}
	
	@GetMapping("/find/{empId}")
	public Employee getEmployeeById(@PathVariable Long empId) {
		Employee employee = service.getEmployeeById(empId);
		return employee;
			
	}
	@GetMapping("find")
	public List<Employee> getAllEmployee(){
		return service.getAllEmployees();
	}
	
	

}
