package com.example.demo.service;

import java.util.HashMap;
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
	
	 
	 public List<Book> findAll(HashMap<String, String> map) {
		 String cname = map.get("cname");
			String keyword = map.get("keyword");
			List<Book> list = null;
			if( keyword != null && !keyword.equals("")) {
				switch(cname) {
				case "bookid":list = dao.findByBookid(Integer.parseInt(keyword));break;
				case "bookname":list = dao.findByBooknameContaining(keyword);break;
				case "publisher":list = dao.findByPublisherContaining(keyword);break;
				case "price":list = dao.findByPrice(Integer.parseInt(keyword));break;
				}
			}else {
				return dao.findAllByOrderByBookname();			
			}
			return list;
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