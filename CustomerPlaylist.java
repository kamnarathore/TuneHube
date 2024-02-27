package com.tunehub.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class CustomerPlaylist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name;
@ManyToMany
List<CustomerSong>song;
public CustomerPlaylist() {
	super();
	// TODO Auto-generated constructor stub
}
public CustomerPlaylist(int id, String name, List<CustomerSong> song) {
	super();
	this.id = id;
	this.name = name;
	this.song = song;
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
public List<CustomerSong> getSong() {
	return song;
}
public void setSong(List<CustomerSong> song) {
	this.song = song;
}
@Override
public String toString() {
	return "CustomerPlaylist [id=" + id + ", name=" + name + ", song=" + song + "]";
}

}
