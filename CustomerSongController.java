package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub.Services.CustomerSongService;
import com.tunehub.Services.SongService;
import com.tunehub.Services.TuneService;
import com.tunehub.entity.CustomerSong;
import com.tunehub.entity.Song;
import com.tunehub.entity.Tune;

import jakarta.servlet.http.HttpSession;

@Controller
public class CustomerSongController 
{
	@Autowired
	CustomerSongService customerserv;
	@Autowired
	TuneService tserv;
	@Autowired
	SongService songserv;
@GetMapping("/map-customersong")
public String explorePremiumSong()
{
	return"addcustomersongs";
}
@PostMapping("/addCustomersong")
public String addSongs(@ModelAttribute CustomerSong song)
{
	boolean status=customerserv.songExists(song.getName());
	if(status==true)
	{
		return "songfail";
	}
	else
	{
		customerserv.addSong(song);
		return "songsuccess";
	}
}
@GetMapping("/explorePremiumSongs")
public String viewSong(HttpSession session,Model model)
{
	String email=(String) session.getAttribute("email");
	Tune user=tserv.getUser(email);
	boolean userStatus=user.isPremium();
	if(userStatus== true)
	{
	List<CustomerSong>songlist=customerserv.fetchAllSongs();
	model.addAttribute("songlist", songlist);
	return "viewsong";
}
	else
	{
		List<Song> songlist=songserv.fetchAllSongs();
		model.addAttribute("songlist", songlist);
		return"displaysongs";
	}

}
}
