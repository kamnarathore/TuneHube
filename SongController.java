package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub.Services.SongService;
import com.tunehub.Services.TuneService;
import com.tunehub.entity.Song;
@Controller
public class SongController {
	@Autowired
	SongService songserv;
	@Autowired
	TuneService tserv;
@PostMapping("/addsong")
public String addSongs(@ModelAttribute Song song)
{
	boolean status=songserv.songExists(song.getName());
	if(status==true)
	{
		return "songfail";
	}
	else
	{
		songserv.addSong(song);
		return "songsuccess";
	}
}
@GetMapping("/map-viewsong")
public String viewSongs(Model model)
{
	List<Song> songlist=songserv.fetchAllSongs();
	model.addAttribute("songlist", songlist);
	return"displaysongs";
}
@GetMapping("/viewSong")
public String customerViewSong(Model model)
{
	boolean primeStatus=true;
	if(primeStatus==true)
	{
		
		List<Song> songlist=songserv.fetchAllSongs();
		model.addAttribute("songlist", songlist);
		return"displaysongs";
	}
	else
	{
		return "makePayment";
	}
}


}
