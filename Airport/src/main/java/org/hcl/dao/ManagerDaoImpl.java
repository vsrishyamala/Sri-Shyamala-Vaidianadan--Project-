package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Manager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ManagerDaoImpl implements ManagerDao {
	@Autowired
	SessionFactory factory;

	@Override
	public Integer insert(Manager manager) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Integer id=(Integer)session.save(manager);
		session.close();
		return id;
	}
	@Override
	public Manager getIdAndPassWord(int id, String passWord)
	{
		Session session = factory.openSession();
		Criteria crit = session.createCriteria(Manager.class);
		Criterion idd= Restrictions.eq("id",id);
		Criterion password =Restrictions.eq("passWord",passWord);
		Criterion condition=Restrictions.and(idd,password);
		crit.add(condition);
		List<Manager> ans= crit.list();
	    return ans.get(0);
		
	}

}
