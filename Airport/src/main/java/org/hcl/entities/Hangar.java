package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hangar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hangarId;
	private String hangarName;
	public Hangar()
	{
		
	}
	public Integer getHangarId() {
		return hangarId;
	}
	public void setHangarId(Integer hangarId) {
		this.hangarId = hangarId;
	}
	
	public String getHangarName() {
		return hangarName;
	}
	public void setHangarName(String hangarName) {
		this.hangarName = hangarName;
	}
	

}
