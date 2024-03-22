package com.example.demo.controller;
<<<<<<< HEAD


import java.util.List;
=======
import java.util.List; 
>>>>>>> branch 'main' of https://github.com/jusunKim/booktest.git

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.BookDAO;
import com.example.demo.dao.CustomerDAO;
import com.example.demo.dao.OrdersDAO;
import com.example.demo.entity.Orders;
import com.example.demo.service.BookService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.OrdersService;

import lombok.Setter;

@Controller
@Setter
public class OrdersController {
	@Autowired
	private BookService bs;
	
	@Autowired
	private CustomerService cs;
	
	@Autowired
	private OrdersService os;
	
	@GetMapping("/listOrder")
	public void list(Model model) {
		model.addAttribute("list", os.findAll());
	}
	
	@GetMapping("/orders/insert")
	public void insert(Model model){
		//model.addAttribute("bList", bs.findAll());
		model.addAttribute("bList", bs.findAll());
		model.addAttribute("cList", cs.findAll());
		model.addAttribute("orderid", os.getNextNo());
	}
	
	@PostMapping("/insertOrder")
	public String save(Orders o) {
		String view = "redirect:/orders/insert";
		os.save(o);
		return view;
	}
	
}
