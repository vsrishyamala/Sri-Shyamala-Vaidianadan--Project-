package org.hcl.dao;

import java.util.List;

import org.hcl.entities.PilotsDetails;

public interface PilotDao {
	public Integer insert(PilotsDetails pilots);
	public List<PilotsDetails> listPilot();


}
