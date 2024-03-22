package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.BookDAO;
import com.example.demo.service.BookService;
import com.example.demo.dao.BookDAO;
import lombok.Setter;

@Controller
@Setter
public class BookController {
	@Autowired
	private BookService bs;
	
	
	@GetMapping("/book/detail")
	public String delete() {
		String view = "/book/manager/list.html";

		return view;
	}
}

