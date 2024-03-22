package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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
	 
	 public Book findByID(int bookid) {
		 Book b = null;
		 Optional<Book> o = dao.findById(bookid);
		 if(o.isPresent()) {
			 b = o.get();
		 }
		 return b; 
	 }
	
}
