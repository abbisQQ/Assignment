package com.babis.theodorou.example.springresth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.babis.theodorou.example.springresth2.entity.Employee;

//This is to indicate that the class defines a data repository.
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
