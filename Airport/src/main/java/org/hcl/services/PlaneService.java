package org.hcl.services;

import java.util.List;

import org.hcl.entities.Planes;

public interface PlaneService {
	public void insertPlane(Planes planes);
	public List<Planes> listPlane();

}
