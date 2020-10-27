package org.hcl.services;

import java.util.List;

import org.hcl.dao.PlaneDao;
import org.hcl.entities.Planes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PlaneServiceImpl implements PlaneService {
	@Autowired
	PlaneDao dao;

	@Override
	public void insertPlane(Planes planes) {
		// TODO Auto-generated method stub
		dao.insert(planes);

	}
	public List<Planes> listPlane()
	{
		dao.listPlane();
		return null;
	}

}
