package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Planes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PlaneDaoImpl implements PlaneDao {
	@Autowired	
	SessionFactory factory;

	@Override
	public Integer insert(Planes planes) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Integer id=(Integer)session.save(planes);
		session.close();
		return id;
		
	}
	@Override
	public List<Planes> listPlane()
	{
		Session session= factory.openSession();
		List<Planes> planes= (List<Planes>) session.createQuery(" from Planes ").list();
		return planes;
	}

}
