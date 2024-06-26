package com.kodilla.hibernate.company.dao;

import com.kodilla.hibernate.company.Company;
import com.kodilla.hibernate.employee.Employee;
import com.kodilla.hibernate.employee.dao.CompanyDao;
import com.kodilla.hibernate.employee.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    void testFindByLastName() {
        // Given
        Employee employee = new Employee("John", "Doe");
        employeeDao.save(employee);

        // When
        List<Employee> result = employeeDao.findByLastName("Doe");

        // Then
        assertEquals(1, result.size());
        assertEquals("John", result.get(0).getFirstName());

        // Cleanup
        employeeDao.deleteAll();
    }

    @Test
    void testFindByPrefix() {
        // Given
        Company company = new Company("TechCorp");
        companyDao.save(company);

        // When
        List<Company> result = companyDao.findByPrefix("Tec");

        // Then
        assertEquals(1, result.size());
        assertEquals("TechCorp", result.get(0).getName());

        // Cleanup
        companyDao.deleteAll();
    }
}