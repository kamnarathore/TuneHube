package com.tunehub.Services;

import com.tunehub.entity.Tune;

public interface TuneService {
	public String addUser(Tune user);
	public boolean emailexists(String email);
	public boolean validateUser(String email,String pass);
	public String getRole(String email);
	public Tune getUser(String email);
	public void updateUser(Tune user);

}
