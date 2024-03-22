package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.BookDAO;
import com.example.demo.dao.CustomerDAO;
import com.example.demo.dao.OrdersDAO;
import com.example.demo.entity.Orders;


import lombok.Setter;

@Controller
@Setter
public class OrdersController {
	@Autowired
	private BookDAO bdao;
	
	@Autowired
	private CustomerDAO cdao;
	
	@Autowired
	private OrdersDAO odao;
	
	@GetMapping("/listOrder")
	public void list(Model model) {
		model.addAttribute("list", odao.findAll());
	}
	
	@GetMapping("/orders/insert")
	public void insert(Model model){
		//model.addAttribute("bList", bs.findAll());
		model.addAttribute("bList", bdao.findAll());
		model.addAttribute("cList", cdao.findAll());
		model.addAttribute("orderid", odao.getNextNo());
	}
	
	@PostMapping("/insertOrder")
	public String save(Orders o) {
		String view = "redirect:/orders/insert";
		odao.save(o);
		return view;
	}
	
}
