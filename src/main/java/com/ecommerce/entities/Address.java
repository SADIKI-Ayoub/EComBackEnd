package com.ecommerce.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
@NamedQuery(name="Addresses.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String city;

	private String country;

	private String line1;

	private String line2;

	private String phone;

	@Column(name="pin_code")
	private String pinCode;

	private int pincode;

	private String state;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public Address() {
		super();
	}

	public Address(int id, String city, String country, String line1, String line2, String phone, String pinCode,
			int pincode2, String state, User user) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
		this.line1 = line1;
		this.line2 = line2;
		this.phone = phone;
		this.pinCode = pinCode;
		pincode = pincode2;
		this.state = state;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}