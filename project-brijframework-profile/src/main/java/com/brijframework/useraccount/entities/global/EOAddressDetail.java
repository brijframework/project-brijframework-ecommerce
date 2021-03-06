package com.brijframework.useraccount.entities.global;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;

@Entity
@Table(name = "ADDRESS_DETAIL")
public class EOAddressDetail extends EntityObject<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "ADDRESSLINE1")
	private String addressLine1;
	
	@Column(name = "ADDRESSLINE2")
	private String addressLine2;
	
	@Column(name = "LANDMARK")
	private String landMark;
	
	@Column(name = "ZIPCODE")
	private Long zipcode;
		
	@ManyToOne
	@JoinColumn(name = "CITY_ID")
	private EOCityDetail city;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	public EOCityDetail getCity() {
		return city;
	}

	public void setCity(EOCityDetail city) {
		this.city = city;
	}

}
