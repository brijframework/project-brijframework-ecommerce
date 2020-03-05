package com.brijframework.useraccount.beans;

public class EOStateDetailDTO extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String code;

	private EOCountryDetailDTO country;

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

	public EOCountryDetailDTO getCountry() {
		return country;
	}

	public void setCountry(EOCountryDetailDTO country) {
		this.country = country;
	}
	
	
}
