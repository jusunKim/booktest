package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDAO;

import lombok.Setter;

@Service
@Setter
public class BookService {
	@Autowired
	private BookDAO dao;
	
}
