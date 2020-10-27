package org.hcl.services;

import org.hcl.dao.ManagerDao;
import org.hcl.entities.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ManagerServicesImpl implements ManagerServices {
	@Autowired
	ManagerDao dao;

	@Override
	public void insertManger(Manager manager) {
		// TODO Auto-generated method stub
		dao.insert(manager);

	}
	@Override
	public Manager getLogin(int id, String passWord)
	{
		Manager manager= dao.getIdAndPassWord(id, passWord);
		return manager;
	}

}
