package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Orders;

public interface OrdersDAO extends JpaRepository<Orders, Integer> {

}
