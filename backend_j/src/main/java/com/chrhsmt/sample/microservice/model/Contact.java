package com.chrhsmt.sample.microservice.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue
    private BigInteger id;

    @Column(name = "name", nullable = false)
    private String name;

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
