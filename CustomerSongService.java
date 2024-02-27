package com.tunehub.Services;

import java.util.List;

import com.tunehub.entity.CustomerSong;

public interface CustomerSongService {

	public boolean songExists(String name);

	public String addSong(CustomerSong song);

	public List<CustomerSong> fetchAllSongs();

}
