package com.chrhsmt.sample.microservice.repository;

import com.chrhsmt.sample.microservice.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ContactRepository extends JpaRepository<Contact, BigInteger> {

}
