package com.tunehub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tune 
{
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
int id;
String name;
String pass;
String gender;
String role;
String address;
String email;
boolean isPremium;
public Tune() {
	super();
	// TODO Auto-generated constructor stub
}
public Tune(int id, String name, String pass, String gender, String role, String address, String email,
		boolean isPremium) {
	super();
	this.id = id;
	this.name = name;
	this.pass = pass;
	this.gender = gender;
	this.role = role;
	this.address = address;
	this.email = email;
	this.isPremium = isPremium;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public boolean isPremium() {
	return isPremium;
}
public void setPremium(boolean isPremium) {
	this.isPremium = isPremium;
}
@Override

public String toString() {
	return "Tune [id=" + id + ", name=" + name + ", pass=" + pass + ", gender=" + gender + ", role=" + role
			+ ", address=" + address + ", email=" + email + ", isPremium=" + isPremium + "]";
}

}
