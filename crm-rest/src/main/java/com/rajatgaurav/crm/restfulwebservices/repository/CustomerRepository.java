package com.rajatgaurav.crm.restfulwebservices.repository;

import com.rajatgaurav.crm.restfulwebservices.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
