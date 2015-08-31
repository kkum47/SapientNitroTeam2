package com.sapient.cui.client;

import java.io.Serializable;

public class Address implements Serializable{

	public static final long serialVersionUID = 1L;
		String street;
		String country;
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return this.street;
	}
	public String getCountry() {
		return this.country;
	}
	@Override
	public String toString() {
		return new StringBuffer("street : ").append(this.street).append(" country: ").append(this.country).toString();
	}
}
