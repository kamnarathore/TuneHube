package com.tunehub.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.tunehub.Repository.SongRepository;
import com.tunehub.entity.Song;
@Service
public class SongServiceImple implements SongService {
	@Autowired
SongRepository srepo;
	@Override
	public String addSong(Song song) {
		srepo.save(song);
		return "song is added";
	}
	

	@Override
	public boolean songExists(String name) {
		Song song =srepo.findByName(name);
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
	public List<Song> fetchAllSongs()
	{
		List<Song>songlist=srepo.findAll();
		return songlist;
	}


	@Override
	public void updateSong(Song song) {
		srepo.save(song);
		
	}

}
