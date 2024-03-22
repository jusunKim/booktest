package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrdersDAO;
import com.example.demo.entity.Orders;

import lombok.Setter;

@Service
@Setter
public class OrdersService {
	@Autowired
	private OrdersDAO dao;
	
	public int getNextNo(){
		return dao.getNextNo();
	}
	
	public void insert(Orders o){
		dao.insert(o);
	}
	
	
	public List<Orders> findAll(String keyword){
		if(keyword != null && !keyword.isEmpty()) {
			return dao.findByCustomer_Name(keyword);
		}
		else {
			return dao.findAll();
		}
	}

}