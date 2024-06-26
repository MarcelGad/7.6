package com.kodilla.hibernate.company;

import javax.persistence.*;

@Entity
@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.findByPrefix",
                query = "SELECT * FROM Company WHERE SUBSTRING(name, 1, 3) = :prefix",
                resultClass = Company.class
        )
})
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}