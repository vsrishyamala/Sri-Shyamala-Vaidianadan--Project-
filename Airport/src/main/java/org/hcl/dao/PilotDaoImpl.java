package org.hcl.dao;

import java.util.List;

import org.hcl.entities.PilotsDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PilotDaoImpl implements PilotDao {
	@Autowired	
	SessionFactory factory;
	@Override
	public Integer insert(PilotsDetails pilots) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Integer id=(Integer)session.save(pilots);
		session.close();
		return id;
		
	}
	@Override
	public List<PilotsDetails> listPilot()
	{
		Session session= factory.openSession();
		List<PilotsDetails> pilot= (List<PilotsDetails>) session.createQuery(" from PilotsDetails ").list();
		return pilot;
	}

}
