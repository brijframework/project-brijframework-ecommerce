package com.brijframework.useraccount.entities.global;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;

@Entity
@Table(name = "CITY_DETAIL")
public class EOCityDetail extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CODE")
	private String code;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STATE_ID")
	private EOStateDetail state;
	
	public EOCityDetail() {
		// TODO Auto-generated constructor stub
	}

	public EOCityDetail(Long id) {
		this.setId(id);
	}

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

	public EOStateDetail getState() {
		return state;
	}

	public void setState(EOStateDetail state) {
		this.state = state;
	}

}
