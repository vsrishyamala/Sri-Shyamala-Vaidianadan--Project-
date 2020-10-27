package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Hangar;
import org.hcl.entities.Planes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HangarDaoImpl implements HangarDao {
	@Autowired	
	SessionFactory factory;

	@Override
	public Integer insertHangar(Hangar hangar) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Integer id=(Integer)session.save(hangar);
		session.close();
		return id;
	}
	@Override
	public List<Hangar> listHangar()
	{
		Session session= factory.openSession();
		List<Hangar> hangar= (List<Hangar>) session.createQuery(" from Hangar ").list();
		return hangar;
	}

}
