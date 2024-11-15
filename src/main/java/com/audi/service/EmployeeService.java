package com.audi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.audi.dto.EmployeeDTO;
import com.audi.emp.entity.Employee;
import com.audi.exception.ResourceNotFoundException;
import com.audi.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

//	public Employee getEmployeeById(Long id) {
//		return employeeRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID " + id));
//	}
	public Employee getEmployeeById(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new ResourceNotFoundException("Employee not found with ID " + id);
		}
	}

	public Employee createEmployee(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		employee.setFirstName(employeeDTO.getFirstName());
		employee.setLastName(employeeDTO.getLastName());
		employee.setEmail(employeeDTO.getEmail());
		return employeeRepository.save(employee);
	}

	public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {
		Employee employee = getEmployeeById(id);
		employee.setFirstName(employeeDTO.getFirstName());
		employee.setLastName(employeeDTO.getLastName());
		employee.setEmail(employeeDTO.getEmail());
		return employeeRepository.save(employee);
	}

	public void deleteEmployee(Long id) {
		Employee employee = getEmployeeById(id);
		employeeRepository.delete(employee);
	}
}
