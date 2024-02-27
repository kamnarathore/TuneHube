package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;import org.springframework.web.bind.annotation.RequestParam;

import com.tunehub.Services.SongService;
import com.tunehub.Services.TuneService;
import com.tunehub.entity.Song;
import com.tunehub.entity.Tune;

import jakarta.servlet.http.HttpSession;
@Controller
public class TuneController {
	@Autowired
TuneService tserv;
	@Autowired
	SongService songserv;
	
@PostMapping("/registeration")
	public String addUser(@ModelAttribute Tune user)
	{
		
			boolean userstatus=tserv.emailexists(user.getEmail());
			if(userstatus==false)
			{
				tserv.addUser(user);
				return"registersuccess";
			}
			else
			{
				return"registerfail";
			}
		
		
	}
@PostMapping("/login")
public String validateUser(@RequestParam String email,@RequestParam String pass,HttpSession session)
{
	if(tserv.validateUser(email, pass)==true)
	{
		session.setAttribute("email",email);
		if(tserv.getRole(email).equals("Admin"))
		{
			return"adminhome";
		}
		else if(tserv.getRole(email).equals("Premium User"))
		{
			return "customerhome1";
		}
		
		else
		{
			return "customerhome";
		}
	}
	else
	{
		
		return "loginfail";
	}
}

@GetMapping("/exploreSongs")
public String exploreUSer(HttpSession session,Model model)
{
	String email=(String) session.getAttribute("email");
	Tune user=tserv.getUser(email);
	boolean userStatus=user.isPremium();
	if(userStatus== true)
	{
		List<Song> songlist=songserv.fetchAllSongs();
		model.addAttribute("songlist", songlist);
	return"displaysongs";
	}
	else
	{
		return"sample";
	}
}
@PutMapping("/updatepass")
public String updatePassword(@RequestParam String email,@RequestParam String pass,Tune user)
{
	if(tserv.emailexists(email))
	{
	user =tserv.getUser(email);
	user.setPass(pass); 
	tserv.updateUser(user);
	return "updated";
	}
	else
	{
		return"updatefail";
	}
}
	
}

