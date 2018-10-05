package com.babis.theodorou.example.springresth2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babis.theodorou.example.springresth2.entity.Employee;
import com.babis.theodorou.example.springresth2.repository.EmployeeRepository;
import com.babis.theodorou.example.springresth2.service.EmployeeService;


//@Services hold business logic and call method in repository layer. 
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	 public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		 this.employeeRepository = employeeRepository;
	 }
	
	
	@Override
	public List<Employee> retrieveEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	
	//Optional in java.util package. It is used to represent a value is present or absent. The main advantage of this new construct is that No more too many null checks and NullPointerException.
	//It avoids any runtime NullPointerExceptions and supports us in developing clean and neat Java APIs or Applications.
	@Override
	public Employee getEmployee(Long employeeId) {
		Optional<Employee> optEmp = employeeRepository.findById(employeeId);
		return optEmp.get();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

}
