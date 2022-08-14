package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productdetails")
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@Column(name = "productname")
	private String pname;
	private String price;
	private String brand;
	private String quantity;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getQuantity() {
		return quantity ;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
