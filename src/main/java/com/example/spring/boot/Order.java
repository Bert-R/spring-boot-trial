package com.example.spring.boot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long		orderID;

	@ManyToOne
	private Product	product;

	private int			quantity;

	private String	customerName;

	private String	shippingAddress;

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}
}