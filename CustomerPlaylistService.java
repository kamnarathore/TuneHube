package com.tunehub.Services;

import java.util.List;

import com.tunehub.entity.CustomerPlaylist;

public interface CustomerPlaylistService 
{

	public void addPlayList(CustomerPlaylist playlist);

	public List<CustomerPlaylist> fetchPlaylist();

}
