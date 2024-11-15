package com.audi.service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.audi.emp.entity.Employee;

@Service
public class EmployeeFileReader {

    public List<Employee> readEmployeesFromFile(String filePath) throws IOException {
        List<Employee> employees = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            Employee employee = new Employee();
            employee.setFirstName(data[0]);
            employee.setLastName(data[1]);
            employee.setEmail(data[2]);
            employees.add(employee);
        }
        reader.close();
        return employees;
    }
}
