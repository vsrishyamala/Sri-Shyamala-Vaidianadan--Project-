package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Planes;


public interface PlaneDao {
	public Integer insert(Planes planes);
	public List<Planes> listPlane();

}
