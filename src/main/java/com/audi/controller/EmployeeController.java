package com.audi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audi.dto.EmployeeDTO;
import com.audi.emp.entity.Employee;
import com.audi.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}

	@PostMapping
	public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.createEmployee(employeeDTO);
	}

	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
		return employeeService.updateEmployee(id, employeeDTO);
	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "Employee with ID " + id + " deleted.";
	}
}
