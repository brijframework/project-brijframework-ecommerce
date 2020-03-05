package com.brijframework.useraccount.beans;

public class EOAddressDetailDTO extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String landMark;
	
	private Long zipcode;
		
	private EOCityDetailDTO city;

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

	public EOCityDetailDTO getCity() {
		return city;
	}

	public void setCity(EOCityDetailDTO city) {
		this.city = city;
	}
}
