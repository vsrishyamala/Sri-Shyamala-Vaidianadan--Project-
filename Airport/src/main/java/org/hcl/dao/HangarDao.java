package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Hangar;

public interface HangarDao {
	public Integer insertHangar(Hangar hangar );
	public List<Hangar> listHangar();



}
