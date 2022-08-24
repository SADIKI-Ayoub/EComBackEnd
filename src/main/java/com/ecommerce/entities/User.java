package com.ecommerce.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int age;

	private String email;

	private String fname;

	private String lname;

	private String password;

	@Lob
	private String photoUrl;

	private int role;

	private String type;

	private String username;

	public User() {
		super();
	}

	public User(int id, int age, String email, String fname, String lname, String password, String photoUrl, int role,
			String type, String username, List<Address> addresses, List<Orders> orders) {
		super();
		this.id = id;
		this.age = age;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.photoUrl = photoUrl;
		this.role = role;
		this.type = type;
		this.username = username;
		this.addresses = addresses;
		this.orders = orders;
	}

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="user")
	private List<Address> addresses;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="user")
	private List<Orders> orders;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
}