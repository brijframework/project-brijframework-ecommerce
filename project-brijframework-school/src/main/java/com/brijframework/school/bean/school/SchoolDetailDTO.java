package com.brijframework.school.bean.school;

import com.brijframework.school.bean.AbstractDTO;
import com.brijframework.school.bean.location.AddressDTO;

public class SchoolDetailDTO extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String logoUrl;
	private AddressDTO address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	
	
}
