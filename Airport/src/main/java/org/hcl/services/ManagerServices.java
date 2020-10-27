package org.hcl.services;

import org.hcl.entities.Manager;

public interface ManagerServices {
	public void insertManger(Manager manager);
	public Manager getLogin(int id, String passWord);


}
