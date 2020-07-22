package com.chrhsmt.sample.microservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class Content extends BaseModel {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
