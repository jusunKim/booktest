package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrdersDAO;

import lombok.Setter;

@Service
@Setter
public class OrdersService {
	@Autowired
	private OrdersDAO dao;
	
}
