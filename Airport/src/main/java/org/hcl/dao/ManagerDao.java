package org.hcl.dao;

import org.hcl.entities.Manager;

public interface ManagerDao {
	public Integer insert(Manager manager);
	public Manager getIdAndPassWord(int id,String passWord);


}
