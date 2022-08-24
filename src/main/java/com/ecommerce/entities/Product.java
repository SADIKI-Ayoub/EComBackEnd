package com.ecommerce.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String description;

	private String image;

	@Lob
	private String images;

	private float price;

	private int quantity;

	@Column(name="short_desc")
	private String shortDesc;

	private String title;

	//bi-directional many-to-one association to OrdersDetail
	@OneToMany(mappedBy="product")
	private List<OrderDetails> ordersDetails;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="cat_id")
	private Category category;

	public Product(int id, String description, String image, String images, float price, int quantity, String shortDesc,
			String title, List<OrderDetails> ordersDetails, Category category) {
		super();
		this.id = id;
		this.description = description;
		this.image = image;
		this.images = images;
		this.price = price;
		this.quantity = quantity;
		this.shortDesc = shortDesc;
		this.title = title;
		this.ordersDetails = ordersDetails;
		this.category = category;
	}

	public Product() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<OrderDetails> getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(List<OrderDetails> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description + ", image=" + image + ", images=" + images
				+ ", price=" + price + ", quantity=" + quantity + ", shortDesc=" + shortDesc + ", title=" + title
				+ ", ordersDetails=" + ordersDetails + ", category=" + category + "]";
	}

}