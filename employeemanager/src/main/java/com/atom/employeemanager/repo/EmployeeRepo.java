package com.atom.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atom.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

//	void deleteEmployeeById(Long id);

//	Employee findEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);
}
