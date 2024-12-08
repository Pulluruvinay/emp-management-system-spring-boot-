package com.employee.repository;

import com.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// To mention the class as DAO  you need to specify the @repository for making database operations...
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

// JpaRepository which is actually used to perform the database operations by providing built-in curd functionality..
