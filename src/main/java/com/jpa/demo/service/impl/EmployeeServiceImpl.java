package com.jpa.demo.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

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
		repository.saveAll(emp);
		
	}

	@Override
	public void deleteEmployeeById(Long empId) {
		repository.deleteById(empId);
		
	}

	@Override
	public void deleteAllEmployees() {
		repository.deleteAll();
		
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		Optional<Employee> ob= repository.findById(empId);
		if(ob.isPresent())
			return ob.get();
		else 
			return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
	  return repository.findAll();
		
	}

	

	@Override
	public List<Employee> getFewEmployees(List<Long> empIds) {
		return repository.findAllById(empIds);
		
		
	}

}
