package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="orders")
public class Orders {
	@Id
	private int orderid;
	
	@ManyToOne
	@JoinColumn(name="custid", insertable= true, updatable=true)
	private Customer customer; 
	
	@ManyToOne
	@JoinColumn (name="bookid", insertable=true, updatable = true)
	private Book book;
	
	private int saleprice;
	private Date orderdate;

}