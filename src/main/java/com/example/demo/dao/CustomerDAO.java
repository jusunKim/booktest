package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, String> {
	@Query(value = "select nvl(max(custid),0)+1 from customer", nativeQuery = true)
	public int getNextNo();
	
	@Query(value="select * from customer where custid=?1 and password=?2", nativeQuery = true)
	public Customer loginCheck(String custid, String password);
}
 