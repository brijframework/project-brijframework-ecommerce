package com.brijframework.useraccount.beans;

public class EOCityDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String code;

	private EOStateDTO state;

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

	public EOStateDTO getState() {
		return state;
	}

	public void setState(EOStateDTO state) {
		this.state = state;
	}

}
