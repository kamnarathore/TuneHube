package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub.Services.CustomerPlaylistService;
import com.tunehub.Services.CustomerSongService;
import com.tunehub.entity.CustomerPlaylist;
import com.tunehub.entity.CustomerSong;

@Controller
public class CustomerPlaylistController {
	@Autowired
	CustomerPlaylistService cpserv;
	@Autowired
	CustomerSongService csongserv;
	
	@GetMapping("/createcustomerplaylist")
	public String createcustomerplaylist(Model model)
	{
		List<CustomerSong>songlist=csongserv.fetchAllSongs();
		model.addAttribute("songlist", songlist);
		return "customercreateplaylist";
	}
@PostMapping("/addCustomerPlaylist")
public String addCustomerPlayList(@ModelAttribute CustomerPlaylist playlist)
{
	cpserv.addPlayList(playlist);
return "customerplaylistsuccess";
}
@GetMapping("/customerviewplaylist")
public String viewPlaylist(Model model)
{
	List<CustomerPlaylist>plist=cpserv.fetchPlaylist();
	model.addAttribute("plist", plist);
	System.out.println(plist);
	return "customerviewplaylist";
}
}
