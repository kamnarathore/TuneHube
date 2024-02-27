package com.tunehub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entity.Song;
import com.tunehub.entity.Tune;

public interface SongRepository extends JpaRepository<Song, Integer>
{
	public Song findByName(String name);
}
