package com.ecommerce.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="orders_details")
@NamedQuery(name="OrderDetails.findAll", query="SELECT o FROM OrderDetails o")
public class OrderDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int quantity;

	//bi-directional many-to-one association to Order
	@ManyToOne
	private Orders order;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(int id, int quantity, Orders order, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.order = order;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}