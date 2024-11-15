package com.audi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.audi.emp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
