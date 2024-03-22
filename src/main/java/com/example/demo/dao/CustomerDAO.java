package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Customer;

public interface CustomerDAO extends JpaRepository<Customer, String> {
	@Query(value = "select nvl(max(custid),0)+1 from customer", nativeQuery = true)
	public int getNextNo();
}
 