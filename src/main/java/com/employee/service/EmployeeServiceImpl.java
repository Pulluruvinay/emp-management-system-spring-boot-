package com.employee.service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

// service method which actually performing the business logics in the class
@Service
public class EmployeeServiceImpl implements EmployeeService {

    // Auto wired which actually used to inject the beans into the class without any explicit written in the xml file..
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        if(Objects.nonNull(employee)){
            employeeRepository.save(employee);
        }
    }

    @Override
    public Employee getById(Long id) {
        Employee employee = null;
        if (Objects.nonNull(id)) {
            Optional<Employee> optionalEmployee = employeeRepository.findById(id);
            if(optionalEmployee.isPresent()){
                employee = optionalEmployee.get();
            }else{
                throw new RuntimeException("Employee not found with the id:"+ id);
            }
        }
        return employee;
    }

    @Override
    public void deleteById(Long id) {
        if(Objects.nonNull(id)){
            employeeRepository.deleteById(id);
        }
    }
}