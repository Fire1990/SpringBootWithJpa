package com.jpa.demo.service;

import java.util.Collection;
import java.util.List;

import com.jpa.demo.model.Employee;

public interface IEmployeeService {

	public void saveEmployee(Employee emp);
	
	public void saveEmployees(Collection<Employee> emp);
	
	public void deleteEmployeeById(Long empId);
	
	public void deleteAllEmployees();
	
	public Employee getEmployeeById(Long empId);
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> getFewEmployees(List<Long> empIds);
	

}
