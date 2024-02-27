package com.tunehub.Services;

import java.util.List;

import com.tunehub.entity.Playlist;

public interface PlayListService  {

	public void addPlayList(Playlist playlist);

	public List<Playlist> fetchPlaylist();

}
