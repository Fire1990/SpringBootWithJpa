package com.jpa.demo.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.model.Employee;
import com.jpa.demo.repo.EmployeeRepository;
import com.jpa.demo.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public void saveEmployee(Employee emp) {
		repository.save(emp);
		
		
	}

	@Override
	public void saveEmployees(Collection<Employee> emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getFewEmployees(List<Long> empIds) {
		// TODO Auto-generated method stub
		return null;
	}

}
