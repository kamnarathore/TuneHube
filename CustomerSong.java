package com.tunehub.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class CustomerSong {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name;
String artist;
String genre;
String link;
@ManyToMany
List<CustomerPlaylist>playlists;
public CustomerSong() {
	super();
	// TODO Auto-generated constructor stub
}
public CustomerSong(int id, String name, String artist, String genre, String link, List<CustomerPlaylist> playlists) {
	super();
	this.id = id;
	this.name = name;
	this.artist = artist;
	this.genre = genre;
	this.link = link;
	this.playlists = playlists;
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
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getLink() {
	return link;
}
public void setLink(String link) {
	this.link = link;
}
public List<CustomerPlaylist> getPlaylists() {
	return playlists;
}
public void setPlaylists(List<CustomerPlaylist> playlists) {
	this.playlists = playlists;
}
@Override
public String toString() {
	return "CustomerSong [id=" + id + ", name=" + name + ", artist=" + artist + ", genre=" + genre + ", link=" + link
			+ "]";
}

}
