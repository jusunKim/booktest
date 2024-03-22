package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDAO;
import com.example.demo.entity.Book;

import lombok.Setter;

@Service
@Setter
public class BookService {
	@Autowired 
	private BookDAO dao;
	
	
	 public List<Book> findAll() {
		 return dao.findAll();
	}
	
}
