package com.model;

public class User {
	private String name;
	private String phone;
	private String email;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void print() {
		System.out.println("Name: " + this.getName());
		System.out.println("Phone: " + this.getPhone());
		System.out.println("Email: " + this.getEmail());
		System.out.println("City: " + this.getCity());
	}
}
