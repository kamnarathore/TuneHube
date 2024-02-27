package com.tunehub.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.Repository.TuneRapository;
import com.tunehub.entity.Tune;
@Service
public  class TuneServiceImple implements TuneService{
	@Autowired
TuneRapository repo;
	
	public String addUser(Tune user) {
		repo.save(user);
		return "user is created and save";
	}

	@Override
	public boolean emailexists(String email) {
		if(repo.findByEmail(email)==null)
		{
			return false;
		}
		else
		{
		return true;
		}
	}

	@Override
	public boolean validateUser(String email, String pass) {
		Tune user=repo.findByEmail(email);
		String db_pass=user.getPass();
		if(db_pass.equals(pass))
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	@Override
	public String getRole(String email) {
		return(repo.findByEmail(email).getRole());
	}

}
