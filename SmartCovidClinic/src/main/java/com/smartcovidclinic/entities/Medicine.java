package com.smartcovidclinic.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "medicine")
public class Medicine {
	
	int medicineid;

	public int getMedicineid() {
		return medicineid;
	}

	public void setMedicineid(int medicineid) {
		this.medicineid = medicineid;
	}

	public Medicine(int medicineid) {
		super();
		this.medicineid = medicineid;
	}

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medicine [medicineid=" + medicineid + "]";
	}
	

}
