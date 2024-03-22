package com.example.demo.controlloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.dao.BookDAO;

import lombok.Setter;

@Controller
@Setter
public class BookController {
	@Autowired
	private BookDAO dao;
}

