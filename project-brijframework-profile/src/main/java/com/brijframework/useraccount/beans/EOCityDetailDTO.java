package com.brijframework.useraccount.beans;

public class EOCityDetailDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String code;

	private EOStateDetailDTO state;

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

	public EOStateDetailDTO getState() {
		return state;
	}

	public void setState(EOStateDetailDTO state) {
		this.state = state;
	}

}
