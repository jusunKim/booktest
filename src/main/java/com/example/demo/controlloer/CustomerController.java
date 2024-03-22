package com.example.demo.controlloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.dao.BookDAO;
import com.example.demo.dao.CustomerDAO;

import lombok.Setter;

@Controller
@Setter
public class CustomerController {
	@Autowired
	private CustomerDAO dao;
}

