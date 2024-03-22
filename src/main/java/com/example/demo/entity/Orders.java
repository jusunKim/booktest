package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="orders")
public class Orders {
	
	@Id
	private int orderid;
	private int custid;
	private int bookid;
	private int saleprice;
	private Date orderdate;
}