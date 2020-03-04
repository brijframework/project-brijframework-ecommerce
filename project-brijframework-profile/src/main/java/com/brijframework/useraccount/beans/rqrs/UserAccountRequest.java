package com.brijframework.useraccount.beans.rqrs;

import javax.validation.constraints.NotEmpty;

import com.brijframework.useraccount.beans.AbstractDTO;

public class UserAccountRequest extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String type;

	@NotEmpty
	private String username;

	@NotEmpty
	private String password;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
