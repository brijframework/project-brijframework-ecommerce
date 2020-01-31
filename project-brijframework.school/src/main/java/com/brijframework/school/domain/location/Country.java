package com.brijframework.school.domain.location;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "COUNTRY")
public class Country extends EntityObject<Long> {

	@Column(name = "NAME")
	private String name;
	
	@Column(name = "CODE")
	private String code;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	private List<State> states;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}
	
	
}
