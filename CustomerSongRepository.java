package com.tunehub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entity.CustomerSong;

public interface CustomerSongRepository extends JpaRepository<CustomerSong, Integer>{
	public CustomerSong findByName(String name);

}
