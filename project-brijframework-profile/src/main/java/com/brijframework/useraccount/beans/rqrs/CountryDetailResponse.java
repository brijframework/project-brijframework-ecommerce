package com.brijframework.useraccount.beans.rqrs;

import com.brijframework.useraccount.beans.AbstractDTO;

public class CountryDetailResponse extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String code;

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

}
