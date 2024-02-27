package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub.Services.PlayListService;
import com.tunehub.Services.SongService;
import com.tunehub.entity.Playlist;
import com.tunehub.entity.Song;

@Controller
public class PlayListController {
	@Autowired
	PlayListService pserv;
	@Autowired
	SongService sserv;
	
	@GetMapping("/createplaylist")
	public String createPlayList(Model model)
	{
		List<Song>songlist=sserv.fetchAllSongs();
		model.addAttribute("songlist", songlist);
		return "createplaylist";
	}
@PostMapping("/addPlaylist")
public String addPlayList(@ModelAttribute Playlist playlist)
{
	pserv.addPlayList(playlist);
return "playlistsuccess";
}
@GetMapping("/viewplaylist")
public String viewPlaylist(Model model)
{
	List<Playlist>plist=pserv.fetchPlaylist();
	model.addAttribute("plist", plist);
	System.out.println(plist);
	return "viewplaylist";
}
}
