package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.BookService;

import jakarta.servlet.http.HttpSession;
import lombok.Setter;

@Controller 
@Setter 
public class BookController { 
	@Autowired
	private BookService bs;
	
	
	@GetMapping("/book/list")
	public void list(Model model) {
		model.addAttribute("list",bs.findAll());
	} 
	
	@GetMapping("/book/detail")
	public void detail(int bookid, Model model) {
		model.addAttribute("b",bs.findByID(bookid));
	}
}