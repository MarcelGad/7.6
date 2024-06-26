package com.kodilla.hibernate.employee.dao;

import com.kodilla.hibernate.company.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyDao extends CrudRepository<Company, Long> {

    @Query(name = "Company.findByPrefix")
    List<Company> findByPrefix(@Param("prefix") String prefix);
}