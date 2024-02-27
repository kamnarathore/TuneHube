package com.tunehub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entity.Tune;

public interface TuneRapository extends JpaRepository<Tune, Integer>
{
	public Tune findByEmail(String email);

}
