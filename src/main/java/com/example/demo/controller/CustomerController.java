package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.BookDAO;
import com.example.demo.dao.CustomerDAO;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

import lombok.Setter;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@GetMapping("/memberJoin")
	public void joinForm() {
		
	}
	
	@PostMapping("/memberJoin")
	public String joinSubmit(Customer c) {
		String view = "redirect:/listBook어쩌구첫화면?";
		System.out.println(c.getName());
		return view;
	}
}

