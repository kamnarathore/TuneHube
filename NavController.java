package com.tunehub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class NavController {
	@GetMapping("/map-register")
	public String registerMapping()
	{
		return "registeration";
	}
	@GetMapping("/map-login")
	public String loginMapping()
	{
		return "login";
	}
	
	@GetMapping("/map-song")
	public String songMapping()
	{
		return"addsongs" ;
	}
	
	@GetMapping("/sample")
	public String sample()
	{
		return"sample" ;
	}
	@GetMapping("/map-customerViewsong")
	public String customerSongMapping()
	{
		return"addcustomersongs" ;
	}
	@GetMapping("/map-pass")
	public String passwordMapping()
	{
		return"forgotpassword";
	}

	}

