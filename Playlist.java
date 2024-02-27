package com.tunehub.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Playlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String Pname;
@ManyToMany
List<Song>song;
public Playlist() {
	super();
	// TODO Auto-generated constructor stub
}
public Playlist(int id, String pname, List<Song> song) {
	super();
	this.id = id;
	Pname = pname;
	this.song = song;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return Pname;
}
public void setPname(String pname) {
	Pname = pname;
}
public List<Song> getSong() {
	return song;
}
public void setSong(List<Song> song) {
	this.song = song;
}
@Override
public String toString() {
	return "Playlist [id=" + id + ", Pname=" + Pname + ", song=" + song + "]";
}

}
