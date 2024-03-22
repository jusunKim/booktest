package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.entity.Customer;

import lombok.Setter;

@Service
@Setter
public class CustomerService {
	@Autowired  
	private CustomerDAO dao;
	
	public void insert(Customer c) {
		dao.save(c);
	}
}
