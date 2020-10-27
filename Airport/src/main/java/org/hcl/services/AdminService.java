package org.hcl.services;


import org.hcl.entities.Admin;

public interface AdminService {
	
	public void insertAdmin(Admin admin);
	public Admin getLogin(int id, String passWord);
}
