package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PilotsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer planeId;
	private Integer pilotId;
	private String pilotName;
	private String planeName;
	public PilotsDetails()
	{
		
	}
	public Integer getPlaneId() {
		return planeId;
	}
	public void setPlaneId(Integer planeId) {
		this.planeId = planeId;
	}
	public Integer getPilotId() {
		return pilotId;
	}
	public void setPilotId(Integer pilotId) {
		this.pilotId = pilotId;
	}
	public String getPilotName() {
		return pilotName;
	}
	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	

}
