package com.ecommerce.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
@NamedQuery(name="Orders.findAll", query="SELECT o FROM Orders o")
public class Orders implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	//bi-directional many-to-one association to OrdersDetail
	@OneToMany(mappedBy="order")
	private List<OrderDetails> ordersDetails;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int id, User user, List<OrderDetails> ordersDetails) {
		super();
		this.id = id;
		this.user = user;
		this.ordersDetails = ordersDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderDetails> getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(List<OrderDetails> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

}
