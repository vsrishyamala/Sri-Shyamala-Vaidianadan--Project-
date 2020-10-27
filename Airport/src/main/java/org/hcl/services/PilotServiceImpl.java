package org.hcl.services;

import java.util.List;

import org.hcl.dao.PilotDao;
import org.hcl.entities.PilotsDetails;
import org.hcl.entities.Planes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PilotServiceImpl implements PilotService {
	@Autowired
	PilotDao dao;
	@Override
	public void insert(PilotsDetails pilots) {
		// TODO Auto-generated method stub
		dao.insert(pilots);

	}
	public List<PilotsDetails> listPilot()
	{
		dao.listPilot();
		return null;
	}

}
