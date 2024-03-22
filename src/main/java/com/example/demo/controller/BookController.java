package com.example.demo.controller;

import java.util.HashMap;

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
	   public void list( HttpSession session, Model model, String keyword, String cname) {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("cname", cname);
			map.put("keyword", keyword);
			model.addAttribute("list", bs.findAll(map));
			model.addAttribute("customer",session.getAttribute("customer"));
	   } 
	
	@GetMapping("/book/detail")
	public void detail(int bookid, Model model) {
		model.addAttribute("b",bs.findByID(bookid));
	}
}

