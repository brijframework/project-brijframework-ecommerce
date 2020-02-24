package com.brijframework.useraccount.beans;

public class EOStateDTO extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String code;

	private EOCountryDTO country;

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

	public EOCountryDTO getCountry() {
		return country;
	}

	public void setCountry(EOCountryDTO country) {
		this.country = country;
	}
	
	
}
