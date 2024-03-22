package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="customer")
public class Customer {
	 
	@Id
	private String custid;
	private String password;
	private String name;
	private String phone;
	private String addr;
}