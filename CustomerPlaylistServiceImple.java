package com.tunehub.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.Repository.CustomerPlaylistRepository;
import com.tunehub.entity.CustomerPlaylist;

@Service
public class CustomerPlaylistServiceImple implements CustomerPlaylistService {
	@Autowired
CustomerPlaylistRepository repo;
	@Override
	public void addPlayList(CustomerPlaylist playlist) {
		repo.save(playlist);
		
	}
	@Override
	public List<CustomerPlaylist> fetchPlaylist() {
		return repo.findAll();
	}

}
