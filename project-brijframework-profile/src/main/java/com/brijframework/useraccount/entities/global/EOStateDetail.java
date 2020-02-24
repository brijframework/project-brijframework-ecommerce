package com.brijframework.useraccount.entities.global;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;

@Entity
@Table(name = "STATE_DETAIL")
public class EOStateDetail extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "NAME")
	private String name;
	
	@Column(name = "CODE")
	private String code;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_ID")
	private EOCountryDetail country;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
	private List<EOCityDetail> cities;

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

	public EOCountryDetail getCountry() {
		return country;
	}

	public void setCountry(EOCountryDetail country) {
		this.country = country;
	}

	public List<EOCityDetail> getCities() {
		return cities;
	}

	public void setCities(List<EOCityDetail> cities) {
		this.cities = cities;
	}

	
}
