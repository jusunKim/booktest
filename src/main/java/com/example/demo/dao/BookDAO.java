package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.demo.entity.Book;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {
  

	public List<Book> findAllByOrderByBookname();
	
	public List<Book> findByBooknameContaining(String bookname);
	public List<Book> findByBookid(Integer bookid);
	public List<Book> findByPublisherContaining(String publisher);
	public List<Book> findByPrice(Integer price);
	
}
 