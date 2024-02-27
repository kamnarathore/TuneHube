package com.tunehub.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.Repository.CustomerSongRepository;
import com.tunehub.entity.CustomerSong;

@Service
public class CustomerSongServiceImple implements CustomerSongService{
	@Autowired
CustomerSongRepository repo;
	@Override
	public boolean songExists(String name) {
		CustomerSong song=repo.findByName(name);
		if(song==null)
		{
		return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	public String addSong(CustomerSong song) {
     repo.save(song);
     return"song is added successfully";
	}
	@Override
	public List<CustomerSong> fetchAllSongs() {
		return repo.findAll();
	}

}
