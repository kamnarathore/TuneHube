package com.tunehub.Services;

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

}
