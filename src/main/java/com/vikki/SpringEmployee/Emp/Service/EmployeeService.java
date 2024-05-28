package com.vikki.SpringEmployee.Emp.Service;

import java.util.List;

import com.vikki.SpringEmployee.Emp.entity.Employee;

public interface EmployeeService {
	
		Employee saveEmployee(Employee employee);

	    List<Employee> fetchAllEmployees();

	    Employee getEmployeeById(Long id);

	    Employee updateEmployeeById(Long id, Employee employee);

	    String deleteDepartmentById(Long id);

}
