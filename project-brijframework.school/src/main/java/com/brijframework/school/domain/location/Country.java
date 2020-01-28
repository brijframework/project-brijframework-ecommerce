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

	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
	@Column(name = "COUNTRY_CODE")
	private String countryCode;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	private List<State> states;
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

}
