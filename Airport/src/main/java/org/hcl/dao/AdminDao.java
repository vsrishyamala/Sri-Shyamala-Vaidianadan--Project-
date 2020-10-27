package org.hcl.dao;

import org.hcl.entities.Admin;

public interface AdminDao {
	public  Integer insert (Admin admin);
	public Admin getIdAndPassWord(int id,String passWord);

}
