package com.babis.theodorou.example.springresth2.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.babis.theodorou.example.springresth2.entity.Employee;
import com.babis.theodorou.example.springresth2.service.EmployeeService;

//The @Controller annotation indicates that a particular class serves the role of a controller. 
//The @Controller annotation acts as a stereotype for the annotated class, indicating its role.
@RestController
public class BasicRestController {

//Autowired annotation can be used directly on properties, therefore eliminating the need
//for getters and setters:	
@Autowired
private EmployeeService employeeService;

public void setEmployeeService(EmployeeService employeeService) {
	this.employeeService = employeeService;
}

@GetMapping("/api/employees")
public List<Employee> getEmployees(){
	List<Employee> employees = employeeService.retrieveEmployees();
	return employees;
}

//@PathVariable used to fetch the value from url 
@GetMapping("/api/employees/{employeeId}")
public Employee getEmployee(@PathVariable(name="employeeId")Long employeeId) {
	return employeeService.getEmployee(employeeId);
}


@PostMapping("/api/employees")
public void saveEmployee(Employee employee) {
	employeeService.saveEmployee(employee);
	System.out.println("Employee Saved Successfully");
}

@DeleteMapping("/api/employees/{employeeId}")
public void deleteEmployee(@PathVariable(name="employeeId")Long employeeId){
	employeeService.deleteEmployee(employeeId);
	System.out.println("Employee Deleted Successfully");
}

@PutMapping("/api/employees/{employeeId}")
public void updateEmployee(@RequestBody Employee employee,@PathVariable(name="employeeId")Long employeeId){
	Employee emp = employeeService.getEmployee(employeeId);
	if(emp!=null) {
		employeeService.updateEmployee(employee);
	}
	
	
	
}




}