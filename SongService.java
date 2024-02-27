package com.tunehub.Services;

import java.util.List;

import com.tunehub.entity.Song;

public interface SongService  {
	public String addSong(Song song );
public boolean songExists(String name);
public List<Song> fetchAllSongs();
public void updateSong(Song song);
	

}
