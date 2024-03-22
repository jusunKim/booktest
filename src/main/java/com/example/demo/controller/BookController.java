package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Book;
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
	
	@GetMapping("/book/detail/{bookid}")
	public String detail(@PathVariable int bookid, Model model) {
		model.addAttribute("b",bs.findByID(bookid));
		return "/book/detail";
	}
	
	@GetMapping("/book/insert")
	public void insertForm() {
		
	}
	
//	@PostMapping("/book/insert")
//	public String insert(Book b) {
//		bs.insert(b)
//		
//	}
}