package com.ecommerce.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
@NamedQuery(name="Categories.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String title;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="category")
	private List<Product> products;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int id, String title, List<Product> products) {
		super();
		this.id = id;
		this.title = title;
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
