package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;


import jakarta.transaction.Transactional;

@Repository
public interface OrdersDAO extends JpaRepository<Orders, Integer> {
	@Query(value = "select nvl(max(orderid),0)+1 from orders", 
			nativeQuery = true)
	public int getNextNo();
	 
	@Modifying
	@Query(value ="insert into orders o(o.orderid,o.custid,o.bookid,o.saleprice,o.orderdate) values(:#{#o.orderid},:#{#o.customer.custid},:#{#o.book.bookid},:#{#o.saleprice},sysdate)",nativeQuery = true)
	@Transactional
	public void insert(@Param("o") Orders o);
	
	public List<Orders> findByCustomer_NameOrderByOrderid(String name);
	public List<Orders> findByCustomer_Name(String name);
}