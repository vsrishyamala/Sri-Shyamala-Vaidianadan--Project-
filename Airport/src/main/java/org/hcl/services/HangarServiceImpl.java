package org.hcl.services;

import java.util.List;

import org.hcl.dao.HangarDao;
import org.hcl.entities.Hangar;
import org.hcl.entities.Planes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HangarServiceImpl implements HangarService {
	@Autowired
	HangarDao dao;

	@Override
	public void insertHangar(Hangar hangar) {
		// TODO Auto-generated method stub
		dao.insertHangar(hangar);

	}
	public List<Hangar> listHangar()
	{
		dao.listHangar();
		return null;
	}


}
