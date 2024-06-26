package com.kodilla.hibernate.employee.dao;

import com.kodilla.hibernate.employee.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Long> {

    @Query(name = "Employee.findByLastName")
    List<Employee> findByLastName(@Param("lastName") String lastName);
}