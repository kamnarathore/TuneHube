package com.tunehub.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tunehub.entity.FormData;
@CrossOrigin("*")
@RestController
public class DemoController {
	@GetMapping("/testGet")
	public String testGet()
	{
		System.out.println("Recieved get request");
		return "Recieved get request";
	}
	@PostMapping("/testPost")
	public String testPost(@RequestBody String data)
	{
		System.out.println("Recieved post request"+data);
		return "Recieved post request";
	}
	@PostMapping("/testForm")
	public String testForm( @RequestBody  String Formdata)
	{
		System.out.println("Recieved Formdata request"+Formdata);
		return "Recieved Formdata request";
	}
	@PostMapping("/formData")
	public String formData( @RequestBody FormData data)
	{
		System.out.println("data="+data);
		return "data="+data;
	}
}
