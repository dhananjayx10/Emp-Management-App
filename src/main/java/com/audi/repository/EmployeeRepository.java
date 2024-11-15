package com.audi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.audi.emp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
/*_______________________________________________________________________________________________
Advantages of Using Spring Data JPA:
Less Code: Eliminates repetitive boilerplate code for CRUD operations.

Readability: Makes code easier to read and maintain.

Efficiency: Provides built-in methods for common operations, which are optimized for performance.
_________________________________________________________________________________________________
Custom Queries: Allows defining custom query methods using method names.
using Spring Data JPA, you focus more on business logic rather than managing database operations,
leading to more efficient and clean code.*/