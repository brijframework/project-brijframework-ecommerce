package com.brijframework.school.domain.comman;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@Entity
@Table(name = "RELIGION")
public class Religion extends EntityObject<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "religion_name")
	private String religionName;
			
	public String getReligionName() {
		return religionName;
	}

	public void setReligionName(String religionName) {
		this.religionName = religionName;
	}

}
