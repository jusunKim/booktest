package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Orders;

public interface OrdersDAO extends JpaRepository<Orders, Integer> {
	@Query(value = "select nvl(max(orderid),0)+1 from orders", 
			nativeQuery = true)
	public int getNextNo();
}
