package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.BookDAO;
import com.example.demo.dao.CustomerDAO;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

import jakarta.servlet.http.HttpSession;
import lombok.Setter;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@GetMapping("/customer/memberJoin")
	public void joinForm() {
		
	}
	
	@PostMapping("/customer/memberJoin")
	public String joinSubmit(Customer c) {
		String view = "redirect:/book/list";
		cs.insert(c);
		return view;
	}
	
	@GetMapping("/customer/login")
	public void loginForm() {
		
	}
	
	@PostMapping("/customer/login")
	public String loginSubmit(Customer c, HttpSession session) {
		System.out.println(c); //확인용
		String view = "redirect:/book/list";
		String id = c.getCustid();
		String pwd = c.getPassword();
		Customer user = cs.loginCheck(id, pwd);
		if(user!=null) {
			session.setAttribute("customer", user);
		}else {
			view = "redirect:/customer/login";
		}
		
		return view;
	}
}

