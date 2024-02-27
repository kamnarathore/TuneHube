package com.tunehub.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.Repository.PlayListRepository;
import com.tunehub.entity.Playlist;

@Service
public class PlayListServiceImple implements PlayListService {
	@Autowired
PlayListRepository prepo;
	@Override
	public void addPlayList(Playlist playlist) {
		
		prepo.save(playlist);
	}
	@Override
	public List<Playlist> fetchPlaylist() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}
	

}
