package org.hcl.services;


import java.util.List;

import org.hcl.entities.PilotsDetails;

public interface PilotService {
	public void insert(PilotsDetails pilots);
	public List<PilotsDetails> listPilot();


}
